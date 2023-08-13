#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin >> s;
    map<char, int> mp;
    int i, c = 0;
    for (i = 0; i < s.length(); i++)
    {
        mp[s[i]]++;
    }
    for (auto it : mp)
        cout << it.first << it.second;
}