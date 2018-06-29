#include <bits/stdc++.h>
using namespace std;

const int N =1e6+20;
pair<int,int> a[N];
int main(){
    int n,x,y;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d%d",&x,&y);
        a[i]=make_pair(x,y);
    }
    sort(a,a+n);
    int curr=min(a[0].first,a[0].second),ans;
    ans = curr;
    for(int i=1;i<n;i++){
        int mx = max(a[i].first,a[i].second),mi=min(a[i].first,a[i].second);
        if(curr > mi){
            ans = max(ans,mx);
            curr=mx;
        }
        else{
            ans = max(ans,mi);
            curr=mi;
        }
    }
    printf("%d",ans);
}
    