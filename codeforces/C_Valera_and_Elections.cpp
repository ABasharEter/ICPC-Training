#include <bits/stdc++.h>
using namespace std;

vector<int> ans;
const int N =1e5+1000;
struct edge {
    int next;
    bool problem;
    bool path_problem;
};
vector<edge> g[N];

bool dfs_calc(int p,int u){
    bool path_problem = false;
    for(auto e = g[u].begin();e!=g[u].end();e++){
        int v = e->next;
        if(v==p)
            continue;
        e->path_problem = dfs_calc(u,v);
        path_problem = e->path_problem || e->problem || path_problem;
        
    }
    return path_problem;
}
void dfs_solve(int p,int u){
    for(auto e = g[u].begin();e!=g[u].end();e++){
        int v = e->next;
        if(v==p)
            continue;
        dfs_solve(u,v);
        if(e->problem && !e->path_problem)
            ans.push_back(v);
    }
}
int main(){
    int n,x,y,t;
    scanf("%d",&n);
    for(int i=0;i<n-1;i++){
        scanf("%d%d%d",&x,&y,&t);
        g[x].push_back({y,bool(t==2),false});
        g[y].push_back({x,bool(t==2),false});
    }
    dfs_calc(-1,1);
    dfs_solve(-1,1);
    printf("%d\n",ans.size());
    for(auto x = ans.begin();x!=ans.end();x++){
        printf("%d ",*x);
    }
}