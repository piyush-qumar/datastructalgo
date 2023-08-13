#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    vector<string>s(n);
    for(int i=0;i<n;i++)
    {
        cin>>s[i];
        unordered_map<string,int>mp;
        int x=s[i].length();
        char ch_arr[x+1];
        strcpy(ch_arr,s[i].c_str());
        int y=ch_arr[0]+ch_arr[1];
        for(int j=2;j<x;j++)
        y-=ch_arr[j];
        //cout<<y<<endl;
        mp.insert({s[i],y});
        

        // for (auto itr = mp.begin(); itr != mp.end(); ++itr) {
        // cout << itr->first
        //      << '\t' << itr->second << '\n';}
        memset(ch_arr,'\0',strlen(ch_arr) ); 
        // memset(ch_arr, ' ', 50);
    }
    // for(int i=0;i<n;i++)
    // {
    //     //int c=s[i][0].c_str();
    //     int x=s[i].length();
    //     char ch_arr[x+1];
    //     strcpy(ch_arr,s[i].c_str());
    //     // cout<<ch_arr<<endl;
    //     for(auto c:ch_arr)
    //     {
    //         cout<<c<<endl;
    //     }
        
    // }
    //cout<<s[i]<<endl;
     return 0;
}