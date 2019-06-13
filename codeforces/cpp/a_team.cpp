
#include <bits/stdc++.h>
using namespace std;

int main() {
    int x,y,z,sum=0,n;
    scanf("%d",&n);
    while(n--){
        scanf("%d%d%d",&x,&y,&z);
        if(x+y+z>=2)
            sum++;
    }
    printf("%d",sum);
    return 0;
}
