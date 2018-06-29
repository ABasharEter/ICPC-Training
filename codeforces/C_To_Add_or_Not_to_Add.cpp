#include <bits/stdc++.h>
using namespace std;

map<int,long long> cnt;
int main(){
    int n,x,k;
    scanf("%d%d",&n,&k);
    for(int i=0;i<n;i++){
        scanf("%d",&x);
        cnt[x]++;
    }
    long long sum =0,cans=0,ans = 0,ansval,lastval;
    auto jit = cnt.begin();
    lastval = jit->first;
    for(auto it = cnt.begin();it!=cnt.end();it++){
        sum += (it->first-lastval)*cans;
        cans += it->second;
        //cout<<it->first<<" "<<it->second<<" "<<sum<<" "<<cans<<"\n";
        while(sum > k && jit->first < it->first){
            if(jit->second){
                sum -= it->first - jit->first;
                cans--;
                jit->second--;
            }else{
                jit++;
            }
        }
        if(cans > ans){
            ans = cans;
            ansval = it->first;
        }
        lastval = it->first;
    }
    printf("%I64d %I64d",ans,ansval);
}
