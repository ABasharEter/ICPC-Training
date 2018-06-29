
#include <bits/stdc++.h>
using namespace std;

int main() {
    int x,y,v;
    for(int i=1;i<=5;i++)
        for(int j=1;j<=5;j++){
            cin>>v;
            if(v==1) {
                x=i;y=j;
            }
        }
    cout<<abs(x-3)+abs(y-3);
    return 0;
}
