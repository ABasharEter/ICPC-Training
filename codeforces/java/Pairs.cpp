#include<iostream>
using namespace std;
void main()
{
	int t;
	cin >> t;
	int a[1000][10],b[1000][5];
	for (int i = 0; i < t; i++)
	{
		for (int j = 0; j < 10; j++)
			cin >> a[i][j];
		for (int o = 0; o < 10; o++)
		{
			int m = a[i][o];
			for (int p = o; p < 10;p++)
				if (a[i][p] < m)
				{
					int s = a[i][p];
					a[i][p] = m;
					m=s;
				}
			a[i][o] = m;
		}
b[i][0] = (a[i][1] + a[i][0] - a[i][2]) / 2;

		if ((a[i][0] + a[i][2] - a[i][1]) % 2 == 0)b[i][1] = (a[i][0] + a[i][2] - a[i][1]) / 2;
		else b[i][1] = (a[i][0] + a[i][2] - a[i][1]) / 2 + 1;
		if ((a[i][1] + a[i][2] - a[i][0]) % 2 == 0)b[i][2] = (a[i][1] + a[i][2] - a[i][0]) / 2;
		else b[i][2] = (a[i][1] + a[i][2] - a[i][0]) / 2 + 1 ;
		if ((a[i][1] + a[i][0] - a[i][2]) % 2 == 0)
		b[i][3] = a[i][3] - b[i][0];else 	b[i][3] = a[i][3] - b[i][0]-1;
		b[i][4] = a[i][9] - b[i][3];
	}
	
	for (int i = 0; i < t; i++)
	{
		cout << "Case " << i+1 << ": " ;
		for (int j = 0; j < 5; j++)
			cout << b[i][j] << " ";
if (i!=t-1)		cout << endl;
	}

		
}