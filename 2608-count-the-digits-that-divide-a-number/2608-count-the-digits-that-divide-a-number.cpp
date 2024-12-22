class Solution {
public:
    int countDigits(int num) {
        int n= num;
        int cnt = 0;
        vector<int> v;
        while(num>0)
        {
            if(n%(num%10)==0)cnt++;
            num=num/10;
        }
        return cnt;
    }
};