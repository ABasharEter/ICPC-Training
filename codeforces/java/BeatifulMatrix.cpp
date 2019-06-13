#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int a[5][5] = { 0 },i1,j1, result;
	for (int i = 0; i < 5; i++)
		for (int j = 0; j < 5; j++)
		{
			cin >> a[i][j];
			if (a[i][j] == 1) { i1 = i; j1 = j;  }
		}
	i1 = abs(2 - i1);
	j1 = abs(2 - j1);
	result = i1 + j1;
	cout << result;
return 0;
}