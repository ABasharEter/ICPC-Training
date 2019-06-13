#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int n,d,r=0;
	cin >> n >> d;
	int *a = new int[n];
	for (int i = 0; i < n; i++)
		cin >> a[i];
	for (int i = 0; i < n; i++)
		for (int j = 0; j < n; j++)
		{
			if (abs(a[i] - a[j])>d||(i==j))continue;
			r++;
		}
	cout << r;
	
}