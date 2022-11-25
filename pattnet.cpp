#include <bits/stdc++.h>
using namespace std;

char findL(string s)
{
    char l = 'Z';

    for (char x : s)
    {
        if (x <= l)
        {
            l = x;
        }
    }

    return l;
}
int main()
{

    int n;
    cin >> n;

    vector<string> s(n);

    for (int i = 0; i < n; i++)
    {
        cin >> s[i];
    }

    auto p = s;
    for (int i = 0; i < n; i++)
    {
        char mi = findL(s[i]);
        string a = s[i];
        cout<<a<<" ";
        for (int j = 0; j < a.size(); j++)
        {
            a[j] -= mi;
            //cout << a[j];
            a[j] += 64;
            //cout << a[j] << "  ";
        }

        s[i] = a;
        // cout<<s[i];
    }

    unordered_map<string, pair<int, int>> m;

    for (int i = 0; i < n; i++)
    {
        m[s[i]].first++;
        m[s[i]].second = i;
    }

    string res = s[0];
    int ans = 0;

    for (auto x : m)
    {
        if (x.second.first == 1)
        {
            res = x.first;
            ans = x.second.second;
            break;
        }
    }

    cout << p[ans];
}