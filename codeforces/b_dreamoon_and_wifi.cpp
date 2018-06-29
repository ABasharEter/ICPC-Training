
#include <bits/stdc++.h>
using namespace std;

double fact(int n){
    double x=1;
    for(int i=2;i<=n;i++)
        x *=i;
    return x;
}

int main() {
   double res;
   int pos=0,neg=0;
   string s1,s2;
   cin>>s1>>s2;
   for(int i=0;i<s2.size();i++){
        if(s1[i] =='+')
            pos++;
        else
            neg++;
        if(s2[i] == '+')
            pos--;
        else if(s2[i] == '-')
            neg--;
   }
   if(neg<0 || pos<0){
       cout<<0;
       return 0;
   }
   res = fact(neg+pos)/(fact(neg)*fact(pos))/pow(2,neg+pos);
   
   cout <<fixed<<setprecision(10)<<res;
}
