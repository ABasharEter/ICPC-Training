
#include <bits/stdc++.h>
using namespace std;

const int N = 1e4;
vector<int> g[N];
int vis[N];
void dfs(int u){
    vis[u] = true;
    for(auto v:g[u])
        if(!vis[v])
            dfs(v);
}
int main() {
    int n,m,x,k;
    int ans = 0,comp=0;
    scanf("%d%d",&n,&m);
    for(int i=0;i<n;i++){
         scanf("%d",&k);
         for(int j=0;j<k;j++){
             scanf("%d",&x);
             g[i].push_back(x+n);
             g[x+n].push_back(i);
         }
    }
    for(int i=0;i<n;i++){
        if(!vis[i]){
            if(g[i].empty()){
                ans++;
            } else {
                dfs(i);
                comp++;
            }
        }
    }
    printf("%d",ans + max(comp-1,0));
    return 0;
}
