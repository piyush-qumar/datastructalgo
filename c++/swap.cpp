#include <bits/stdc++.h>
using namespace std;
void swap(int a, int b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
    cout << a << " " << b;
    cout << endl;
}
void swap(double *a, double *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
    cout << a << " " << b;
}
int main()
{
    int a = 10;
    int b = 20;
    swap(a, b);
    swap((double)a, (double)b);
    return 0;
}