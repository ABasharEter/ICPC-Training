
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n,m,ans=0;
    cin>>n>>m;
    for(int b=0;b<=n && b*b<=m;b++){
        for(int a=0;a*a<=n&&a<=m;a++){
            if(a*a+b==n&&b*b+a==m)
                ans++;
        }
    }
    cout<<ans;
    return 0;
}
