#include<iostream>
using namespace std;
int main()
{
	int m,n,m1,m2,s1,s2;
	long long result = 0;
	int a[30][2];
	cin >> n >> m;
	for (int i = 0; i<m; i++)
	{
		cin>>a[i][0]>>a[i][1]; 
	}
	for (int i = 0; i< m; i++)
	{
		 m1 = a[i][0];
		 m2 = a[i][1];
		for (int j = i; j< m; j++)
			if (a[j][1]>m2)
			{
				 s1 = a[j][0];
				a[j][0] = m1;
				m1 = s1;
				 s2 = a[j][1];
				a[j][1] = m2;
				m2 = s2;
			}
		a[i][0] = m1;
		a[i][1] = m2;
	}

	int c = 0, z = 0;
	while ((c<n)&&(z<m))
	{
		while (a[z][0] != 0)
		{
			result += a[z][1]; a[z][0]--; c++; if (c == n)break;
		}
		z++;
	}
	cout << result;
}