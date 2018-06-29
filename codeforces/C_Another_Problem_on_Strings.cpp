#include <bits/stdc++.h>
using namespace std;

const int N =1e6+10;
char s[N];
int a[N],cnt[N];
int main(){
    int k;
    scanf("%d",&k);
    scanf("%s",s);
    int n =strlen(s);
    for(int i=1;i<=n;i++){
        a[i] = a[i-1] + (s[i-1]-'0');
    }
    for(int i=1;i<=n;i++){
        auto er = equal_range(a+1,a+n+1,a[i]);
        cnt[i]=er.second-er.first;
        cout<<cnt[i];
    }
    int j=0,ans=0;
    for(int i=1;i<=n;i++){
        if(a[i]-k>=0) {
            ans+=cnt[a[i]-k];
        }
    }
    printf("%d",ans);
}