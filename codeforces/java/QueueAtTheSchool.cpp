#include<iostream>
using namespace std;
int main()
{
	char a[51], b[51];
	short n, t;
	cin >> n >> t;
	cin >> a;//yes
	for (short i = 0; i < n; i++)
		b[i] = a[i]; b[n] = '\0';
	while (t > 0)
	{
		for (short i = 0; i < n; i++)
			if (a[i] == 'B'&&a[i + 1] == 'G')
			{
				b[i] = 'G'; b[i+1] = 'B';

			}
		for (short i = 0; i < n; i++)
			a[i] = b[i];
		t--;
	}
	cout << b;
return 0;
}