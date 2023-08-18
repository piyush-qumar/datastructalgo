#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    sort(arr, arr + n);
    int q;
    cin >> q;
    while (q--)
    {
        int x;
        cin >> x;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] <= x)
            {
                sum += arr[i];
                count++;
            }
        }
        cout << count << " " << sum;
    }
    return 0;
}