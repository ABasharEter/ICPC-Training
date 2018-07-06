
#include <bits/stdc++.h>
using namespace std;
// content of DSU reference

// content of LST reference
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

int main() {
    vector<int> a;
    int n;
    scanf("%d",&n);
    a.resize(n);
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int ans = LSI(a).size();
    printf("%d",ans);
    return 0;
}
