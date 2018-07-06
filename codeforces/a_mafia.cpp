
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef ll ptype;
#define REMOVE_REDUNDANT

// content of DSU reference
class dsu{
public:
    vector<int> sets;

    void init(int n)
    {
        sets.resize(n);
        for(int i=0;i<n;i++)
        {
            sets[i] = -1;
        }
    }

    int find_set(int x)
    {
        if (sets[x] < 0) return x;
        return sets[x] = find_set(sets[x]);
    }
    int union_sets(int x, int y)
    {
        int r[] = { find_set(x), find_set(y) };
        if (r[0] == r[1])
            return -1;
        int l = (sets[r[0]] < sets[r[1]]) ? 0 : 1;
        sets[r[l]] += sets[r[l^1]];
        sets[r[l^1]] = r[l];
        return -sets[r[l]];
    }
};

// content of Geometry reference

const ptype EPS = 1e-13;
const ptype INF = 1e18;
struct PT {
  ptype x, y;
  PT() {}
  PT(ptype x, ptype y) : x(x), y(y) {}
  PT(const PT &p) : x(p.x), y(p.y)    {}
  PT operator + (const PT &p)  const { return PT(x+p.x, y+p.y); }
  PT operator - (const PT &p)  const { return PT(x-p.x, y-p.y); }
  PT operator * (ptype c)     const { return PT(x*c,   y*c  ); }
  PT operator / (ptype c)     const { return PT(x/c,   y/c  ); }
  bool operator<(const PT &rhs) const { return make_pair(y,x) < make_pair(rhs.y,rhs.x); }
  bool operator==(const PT &rhs) const { return make_pair(y,x) == make_pair(rhs.y,rhs.x); }
};

ptype dot(PT p, PT q)     { return p.x*q.x+p.y*q.y; }
ptype dist2(PT p, PT q)   { return dot(p-q,p-q); }
ptype cross(PT p, PT q)   { return p.x*q.y-p.y*q.x; }
ptype area2(PT a, PT b, PT c) { return cross(a,b) + cross(b,c) + cross(c,a); }



ostream &operator<<(ostream &os, const PT &p) {
  os << "(" << p.x << "," << p.y << ")";
  return os;
}

// rotate a point CCW or CW around the origin
PT RotateCCW90(PT p)   { return PT(-p.y,p.x); }
PT RotateCW90(PT p)    { return PT(p.y,-p.x); }
PT RotateCCW(PT p, ptype t) {
  return PT(p.x*cos(t)-p.y*sin(t), p.x*sin(t)+p.y*cos(t));
}

// project point c onto line through a and b
// assuming a != b
PT ProjectPointLine(PT a, PT b, PT c) {
  return a + (b-a)*dot(c-a, b-a)/dot(b-a, b-a);
}

// project point c onto line segment through a and b
PT ProjectPointSegment(PT a, PT b, PT c) {
  ptype r = dot(b-a,b-a);
  if (fabs(r) < EPS) return a;
  r = dot(c-a, b-a)/r;
  if (r < 0) return a;
  if (r > 1) return b;
  return a + (b-a)*r;
}

// compute distance from c to segment between a and b
ptype DistancePointSegment(PT a, PT b, PT c) {
  return sqrt(dist2(c, ProjectPointSegment(a, b, c)));
}

// compute distance between point (x,y,z) and plane ax+by+cz=d
ptype DistancePointPlane(ptype x, ptype y, ptype z,
                          ptype a, ptype b, ptype c, ptype d)
{
  return fabs(a*x+b*y+c*z-d)/sqrt(a*a+b*b+c*c);
}

// determine if lines from a to b and c to d are parallel or collinear
bool LinesParallel(PT a, PT b, PT c, PT d) {
  return fabs(cross(b-a, c-d)) < EPS;
}

bool LinesCollinear(PT a, PT b, PT c, PT d) {
  return LinesParallel(a, b, c, d)
      && fabs(cross(a-b, a-c)) < EPS
      && fabs(cross(c-d, c-a)) < EPS;
}

// determine if line segment from a to b intersects with
// line segment from c to d
int SegmentsIntersect(PT a, PT b, PT c, PT d) {
  if (LinesCollinear(a, b, c, d)) {
    if (dist2(a, c) < EPS || dist2(a, d) < EPS ||
      dist2(b, c) < EPS || dist2(b, d) < EPS) return 2;
    if (dot(c-a, c-b) > 0 && dot(d-a, d-b) > 0 && dot(c-b, d-b) > 0)
      return 0;
    return 2;
  }
  if (cross(d-a, b-a) * cross(c-a, b-a) > 0) return 0;
  if (cross(a-c, d-c) * cross(b-c, d-c) > 0) return 0;
  return 1;
}

// compute intersection of line passing through a and b
// with line passing through c and d, assuming that unique
// intersection exists; for segment intersection, check if
// segments intersect first
PT ComputeLineIntersection(PT a, PT b, PT c, PT d) {
  b=b-a; d=c-d; c=c-a;
  assert(dot(b, b) > EPS && dot(d, d) > EPS);
  return a + b*cross(c, d)/cross(b, d);
}

// compute center of circle given three points
PT ComputeCircleCenter(PT a, PT b, PT c) {
  b=(a+b)/2;
  c=(a+c)/2;
  return ComputeLineIntersection(b, b+RotateCW90(a-b), c, c+RotateCW90(a-c));
}

// determine if point is in a possibly non-convex polygon (by William
// Randolph Franklin); returns 1 for strictly interior points, 0 for
// strictly exterior points, and 0 or 1 for the remaining points.
// Note that it is possible to convert this into an *exact* test using
// integer arithmetic by taking care of the division appropriately
// (making sure to deal with signs properly) and then by writing exact
// tests for checking point on polygon boundary
bool PointInPolygon(const vector<PT> &p, PT q) {
  bool c = 0;
  for (size_t i = 0; i < p.size(); i++){
    int j = (i+1)%p.size();
    if ((p[i].y <= q.y && q.y < p[j].y || p[j].y <= q.y && q.y < p[i].y) &&
      (q.x < (p[i].x + (p[j].x - p[i].x) * (q.y - p[i].y) / (p[j].y - p[i].y)))
      )
      c = !c;
  }
  return c;
}

// determine if point is on the boundary of a polygon
bool PointOnPolygon(const vector<PT> &p, PT q) {
  for (size_t i = 0; i < p.size(); i++)
    if (dist2(ProjectPointSegment(p[i], p[(i+1)%p.size()], q), q) < EPS)
      return true;
  return false;
}

// compute intersection of line through points a and b with
// circle centered at c with radius r > 0
vector<PT> CircleLineIntersection(PT a, PT b, PT c, ptype r) {
  vector<PT> ret;
  b = b-a;
  a = a-c;
  ptype A = dot(b, b);
  ptype B = dot(a, b);
  ptype C = dot(a, a) - r*r;
  ptype D = B*B - A*C;
  if (D < -EPS) return ret;
  ret.push_back(c+a+b*(-B+sqrt(D+EPS))/A);
  if (D > EPS)
    ret.push_back(c+a+b*(-B-sqrt(D))/A);
  return ret;
}

// compute intersection of circle centered at a with radius r
// with circle centered at b with radius R
vector<PT> CircleCircleIntersection(PT a, PT b, ptype r, ptype R) {
  vector<PT> ret;
  ptype d = sqrt(dist2(a, b));
  if (d > r+R || d+min(r, R) < max(r, R)) return ret;
  ptype x = (d*d-R*R+r*r)/(2*d);
  ptype y = sqrt(r*r-x*x);
  PT v = (b-a)/d;
  ret.push_back(a+v*x + RotateCCW90(v)*y);
  if (y > 0)
    ret.push_back(a+v*x - RotateCCW90(v)*y);
  return ret;
}

// This code computes the area or centroid of a (possibly nonconvex)
// polygon, assuming that the coordinates are listed in a clockwise or
// counterclockwise fashion.  Note that the centroid is often known as
// the "center of gravity" or "center of mass".
ptype ComputeSignedArea(const vector<PT> &p) {
  ptype area = 0;
  for(size_t i = 0; i < p.size(); i++) {
    int j = (i+1) % p.size();
    area += p[i].x*p[j].y - p[j].x*p[i].y;
  }
  return area / 2.0;
}

ptype ComputeArea(const vector<PT> &p) {
  return fabs(ComputeSignedArea(p));
}

PT ComputeCentroid(const vector<PT> &p) {
  PT c(0,0);
  ptype scale = 6.0 * ComputeSignedArea(p);
  for (size_t i = 0; i < p.size(); i++){
    int j = (i+1) % p.size();
    c = c + (p[i]+p[j])*(p[i].x*p[j].y - p[j].x*p[i].y);
  }
  return c / scale;
}

// tests whether or not a given polygon (in CW or CCW order) is simple
bool IsSimple(const vector<PT> &p) {
  for (size_t i = 0; i < p.size(); i++) {
    for (size_t k = i+1; k < p.size(); k++) {
      size_t j = (i+1) % p.size();
      size_t l = (k+1) % p.size();
      if (i == l || j == k) continue;
      if (SegmentsIntersect(p[i], p[j], p[k], p[l]))
        return false;
    }
  }
  return true;
}


#ifdef REMOVE_REDUNDANT
bool between(const PT &a, const PT &b, const PT &c) {
  return (fabs(area2(a,b,c)) < EPS && (a.x-b.x)*(c.x-b.x) <= 0 && (a.y-b.y)*(c.y-b.y) <= 0);
}
#endif

void ConvexHull(vector<PT> &pts) {
  sort(pts.begin(), pts.end());
  pts.erase(unique(pts.begin(), pts.end()), pts.end());
  vector<PT> up, dn;
  for (size_t i = 0; i < pts.size(); i++) {
    while (up.size() > 1 && area2(up[up.size()-2], up.back(), pts[i]) >= 0) up.pop_back();
    while (dn.size() > 1 && area2(dn[dn.size()-2], dn.back(), pts[i]) <= 0) dn.pop_back();
    up.push_back(pts[i]);
    dn.push_back(pts[i]);
  }
  pts = dn;
  for (int i = (int) up.size() - 2; i >= 1; i--) pts.push_back(up[i]);

#ifdef REMOVE_REDUNDANT
  if (pts.size() <= 2) return;
  dn.clear();
  dn.push_back(pts[0]);
  dn.push_back(pts[1]);
  for (size_t i = 2; i < pts.size(); i++) {
    if (between(dn[dn.size()-2], dn[dn.size()-1], pts[i])) dn.pop_back();
    dn.push_back(pts[i]);
  }
  if (dn.size() >= 3 && between(dn.back(), dn[0], dn[1])) {
    dn[0] = dn.back();
    dn.pop_back();
  }
  pts = dn;
#endif
}


// content of LST reference
vector<int> LSI(vector<int> &v){
    vector<int> ans;
    for(auto x:v){
        auto it = upper_bound(ans.begin(), ans.end(), x);//set to lower_bound for strictly incressing
        if (it == ans.end()) ans.push_back(x);
        else *it = x;
    }
    return ans;
}

// content of NumberTheory reference

ll  GCD(ll  a,ll  b){ return (!a)?b:GCD(b%a,a); }

map<ll,int> factorize(ll n){
    map<ll,int> factors;
    ll d = 2;
    while(n > 1) {
      int power = 0;
      while (n % d == 0) {
        ++power;
        n /= d;
      }
      if (power > 0) {
        factors[d] = power;
      }
      ++d;
      if (d * d > n) {
        d = n;
      }
    }
    return factors;
}

vector<ll> allDivisors(ll n){
    vector<ll> ans;
    for(ll d=1;d*d<=n;d++){
        if(n%d == 0){
            ans.push_back(d);
            if (d * d != n)
                ans.push_back(n / d);
        }
    }
    sort(ans.begin(),ans.end());
    return ans;
}
int n;
const int N = 1e5+100;
int a[N];
long long tot;
bool can(ll g){
  ll sum = g*n-tot;
  //cout<<"\ng: "<<g<<" sum: "<<sum<<"\n";
  for(int i=0;i<n;i++){
    if(a[i] > g)
      return false;
    ll cur = sum-(g-a[i]);
    //cout<<"("<<a[i]<<","<<cur<<") ";
    if(cur < a[i])
      return false;
  }
  return true;
}

int main() {
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",a+i);  
    tot+=a[i];
  }
  ll l=0,r=tot+10,ans;
  while(l<=r) {
    ll mid = l+(r-l)/2;
    if(can(mid)){
      ans = mid;
      r=mid-1;
    }
    else
      l=mid+1;
  }
  printf("%I64d",ans);
  return 0;
}
