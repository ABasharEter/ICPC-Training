#include<iostream>
using namespace std;
int main()
{
	long long n, m, a, h, w;
	cin >> n >> m >> a;
	if (n%a == 0)
		w = n / a;
	else
		w = n / a + 1;
	if (m%a == 0)
		h = m / a;
	else
		h = m / a + 1;
     long long r=w*h;
	cout << r;
}