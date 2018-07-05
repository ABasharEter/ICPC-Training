#include<iostream>
using namespace std;
bool isLucky(int);
int main()
{
	int a;
	cin >> a;
	for (int i = a + 1;;i++)
		if (isLucky(i)) { a = i; break; }
	cout << a;
return 0;
}
bool isLucky(int m)
{
	int a[4] , b, c;;
	a[0] = m / 1000;
	b = m % 1000;
	a[1] = b / 100;
	c = b % 100;
	a[2] = c / 10;
	a[3] = c % 10;
	for (int i = 0; i<4; i++)
		for (int j = i + 1; j<4; j++)
			if (a[i] == a[j])return false; 
	return true;
}