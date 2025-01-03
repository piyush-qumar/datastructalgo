class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        queue<int>q;
        stack<int>st;
        int temp = x;
        while(temp>0)
        {
            int digit = temp%10;
            st.push(digit);
            q.push(digit);
            temp=temp/10;
        }
        while(!q.empty()) {
            if(q.front()!=st.top()) { return false; }
            q.pop();
            st.pop();
        }
        return true;
    }
};