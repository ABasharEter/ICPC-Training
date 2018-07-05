#include<iostream>
using namespace std;
int main()
{
	int n, a1 = 0, a2 = 0, a3 = 0, result = 0;
	cin >> n;
	int a[100001];
	for (int i = 0; i < n; i++)
	{
		cin >> a[i];
		if (a[i] == 4)result++;
		else if (a[i] == 3)a3++;
		else if (a[i] == 2)a2++;
		else a1++;
	}
	if (a3 >= a1) { result += a3; a1 = 0; a3 = 0; }
	else { result += a3; a1 -= a3; a3 = 0; result += a1 / 4; }
	result += a2 / 2;
	if (a2 % 2 != 0)
	{
		if (a1 % 4 == 1 || a1 % 4 == 2 || a1 % 4 == 0)
			result++;
		if (a1 % 4 == 3) result += 2;
	}
	else
	{
		if (a1 % 4 != 0)
			result++;
	}
	cout << result;
}