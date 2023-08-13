#include<bits/stdc++.h>
using namespace std;
    int check(int a,vector<int>&nums)
    {
        for(int i=0;i<=nums.size();i++)
        {
            if(a==nums[i])
                return 1;
        }
        return 0;
    }
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int>x;
        for(int i=1;i<=nums.size();i++)
        {
            if(!check(i,nums))
            x.push_back(i);
        }
        return x;
    }
    int main()
    {
        vector<int>nums={1,1};//{4,3,2,7,8,2,3,1};
        vector<int>ans=findDisappearedNumbers(nums);
        for(int i=0;i<ans.size();i++)
        {
            cout<<ans[i]<<" ";
        }
        return 0;
    }