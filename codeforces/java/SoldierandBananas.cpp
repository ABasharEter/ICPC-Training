#include <iostream>
using namespace std;


int main()
{
	int w, n, k;
	long long s = 0;
	cin >> k >> n >> w;
	for (int i = 1; i <= w; i++)
		s += i*k;
	if (n >= s)cout << 0;
	else cout << s - n;
	return 0;
}

