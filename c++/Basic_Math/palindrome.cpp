#include <iostream>
using namespace std;

class Solution {
public:

    /* Function to check if a 
    number is palindrome or not*/
    bool isPalindrome(int n) {
        int copy =n;
            if(n==0) return true;
        int res = 0;
        while(n>0) {
            int x = n%10;
            res = res*10+x;
            n=n/10;
        }
        if(res == copy)
        return true;
        else
        return false;
    }
};

int main()
{
    int n;
    cin>>n;
    
    /* Creating and instance of 
    Solution class */
    Solution sol; 
    
    // Function call to check if n is a palindrome
    bool ans = sol.isPalindrome(n);
    
    if(ans) cout << "The given number is a palindrome";
    else cout << "The given number is not a palindrome";
    
    return 0;
}