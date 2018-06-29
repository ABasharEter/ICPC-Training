
#include <bits/stdc++.h>
using namespace std;

const int N = 1e4;
pair<int,int> a[N];
int main() {
    int n,s;
    scanf("%d%d",&s,&n);
    for(int i=0;i<n;i++){
        scanf("%d%d",&a[i].first,&a[i].second);
    }
    sort(a,a+n);
    for(int i=0;i<n;i++){
        if(s<=a[i].first){
            puts("NO");
            return 0;
        }
        s+=a[i].second;
    }
    puts("YES");
    return 0;
}
