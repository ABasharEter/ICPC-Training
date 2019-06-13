#include <bits/stdc++.h>
using namespace std;

int main(){
    string s;
    cin>>s;
    if(s.find("0000000") != s.npos || s.find("111111") != s.npos){
        cout<<"NO";
    }
    else{
        cout<<"YES";
    }
}
