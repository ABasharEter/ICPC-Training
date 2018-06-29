
#include <bits/stdc++.h>
using namespace std;

int main() {
    int x,n,last,ans = 1;
    scanf("%d",&n);
    scanf("%d",&last);
    for(int i=1;i<n;i++){
        scanf("%d",&x);
        if(x != last)
            ans++;
        last = x;
    }
    printf("%d",ans);
    return 0;
}
