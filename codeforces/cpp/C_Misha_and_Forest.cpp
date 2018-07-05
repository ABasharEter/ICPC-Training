#include <bits/stdc++.h>
using namespace std;

const int N = 1e6+100;
int deg[N],xorsum[N];
int ans[N][2],m;

int main(){
    int n,x,y;
    queue<int> q;
    scanf("%d",&n);
    for(int i=0;i<n;i++) {
        scanf("%d%d",deg+i,xorsum+i);
        if(deg[i] == 1){
            q.push(i);
        }
    }
    while(!q.empty()){
        x = q.front();q.pop();
        if(!deg[x]) continue;
        y = xorsum[x];
        xorsum[y] ^=x;
        deg[y]--;
        ans[m][0]=x;
        ans[m++][1]=y;
        if(deg[y] == 1){
            q.push(y);
        }
    }
    printf("%d\n",m);
    for(int i=0;i<m;i++){
        printf("%d %d\n",ans[i][0],ans[i][1]);
    }
}
