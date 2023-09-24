//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
// User function template for C++
class Solution
{
public:
    // Function to find maximum product subarray
    long long maxProduct(vector<int> arr, int n)
    {
        // code here
        long long result = INT_MIN, pre = 1, post = 1;
        for (int i = 0; i < n; i++)
        {
            pre = pre * arr[i];
            post = post * arr[n - i - 1];
            result = max(result, max(pre, post));
            if (pre == 0)
                pre = 1;
            if (post == 0)
                post = 1;
        }

        return result;
    }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, i;
        cin >> n;
        vector<int> arr(n);
        for (i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.maxProduct(arr, n);
        cout << ans << "\n";
    }
    return 0;
}
// } Driver Code Ends