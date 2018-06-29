#include <bits/stdc++.h>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    int l = min(n,m)+1;
    cout<<l<<"\n";
    for(int i=0;i<l;i++){
        cout<<i<<" "<<l-i-1<<"\n";
    }
}
