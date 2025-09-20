#include<iostream>
#include<unordered_map>
#include<string>
using namespace std;
class Solution {
public:
    /* Function to check if two strings are isomorphic or not */
    bool isIsomorphic(string a, string b) {
        if(a.length()!= b.length())
        return false;
        unordered_map<char,char> mpst;
        unordered_map<char,char> mpts;
        for(int i =0;i<a.length();i++) {
            char x = a[i];
            char y = b[i];
            if(mpst.find(x)!=mpst.end() && mpst[x]!=y)
            return false;
            if(mpts.find(y)!=mpts.end() && mpts[y]!=x)
            return false;

            mpst[x] = y;
            mpst[y] = x;
            
        }
        return true;
    }
};


    int main() {
        string a,b;
        cin>>a>>b;
        Solution obj;
        if(obj.isIsomorphic(a,b)) {
            cout<<"Yes"<<endl;
        } else {
            cout<<"No"<<endl;
        }
    }
