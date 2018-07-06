#include <bits/stdc++.h>
using namespace std;
class dsu{
public:
    vector<int> sets;

    void init(int n)
    {
        sets.resize(n);
        for(int i=0;i<n;i++)
        {
            sets[i] = -1;
        }
    }

    int find_set(int x)
    {
        if (sets[x] < 0) return x;
        return sets[x] = find_set(sets[x]);
    }
    int union_sets(int x, int y)
    {
        int r[] = { find_set(x), find_set(y) };
        if (r[0] == r[1])
            return -1;
        int l = (sets[r[0]] < sets[r[1]]) ? 0 : 1;
        sets[r[l]] += sets[r[l^1]];
        sets[r[l^1]] = r[l];
        return -sets[r[l]];
    }
};