#include <bits/stdc++.h>
using namespace std;

int main(){
    long long r,g,b;
    cin>>r>>g>>b;
    long long v[3] = {r,g,b};
    sort(v,v+3);
    cout<<min((r+g+b)/3,v[0]+v[1]);
}
