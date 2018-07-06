#include <bits/stdc++.h>
using namespace std;
vector<int> LSI(vector<int> &v){
    vector<int> ans;
    for(auto x:v){
        auto it = upper_bound(ans.begin(), ans.end(), x);//set to lower_bound for strictly incressing
        if (it == ans.end()) ans.push_back(x);
        else *it = x;
    }
    return ans;
}