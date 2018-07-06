#include <bits/stdc++.h>
using namespace std;
typedef long long  ll;

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
