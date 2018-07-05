
#include <bits/stdc++.h>
using namespace std;

int main() {
    long long n,k,ans,oddn;
    cin>>n>>k;
    k--;
    oddn = (n+1)/2;
    if(k<oddn)
        ans = k*2+1;
    else
        ans = (k-oddn+1)*2;
    cout<<ans; 
    return 0;
}