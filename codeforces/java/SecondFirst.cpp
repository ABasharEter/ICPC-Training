#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	double PI = 22 / 7;
	int a, b, r,w,h;
	cin >> a >> b >> r; r = 2 * r;
	if (a%r == 0)
		w = a / r;
	else
		w = a / r + 1;
	if (b%r == 0)
		h = b/ r;
	else
		h = a / r + 1;
	long long g = w*h;
	if (g % 2 == 0)cout << "First";
	else cout << "Second";
}