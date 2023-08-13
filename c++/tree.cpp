#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    struct TrieNode
    {
        TrieNode *child[26];
        bool isEnd;
        TrieNode()
        {
            for (int i = 0; i < 26; i++)
                child[i] = NULL;
            isEnd = false;
        }
    };

    void insert(string &s, TrieNode *root)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (root->child[s[i] - 'a'] == NULL)
                root->child[s[i] - 'a'] = new TrieNode();
            root = root->child[s[i] - 'a'];
        }
        root->isEnd = true;
    }
    void dfs(string &s, TrieNode *root, vector<string> &vec)
    {
        if (root->isEnd == true)
            vec.push_back(s);
        for (int i = 0; i < 26; i++)
        {
            if (root->child[i] != NULL)
            {
                s += ('a' + i);
                dfs(s, root->child[i], vec);
                s.pop_back();
            }
        }
    }
    vector<string> findit(string pre, TrieNode *root)
    {
        for (int i = 0; i < pre.length(); i++)
        {
            if (root->child[pre[i] - 'a'] == NULL)
                return {"0"};
            else
                root = root->child[pre[i] - 'a'];
        }
        vector<string> vec;
        dfs(pre, root, vec);
        return vec;
    }
    vector<vector<string>> displayContacts(int n, string contact[], string s)
    {
        vector<vector<string>> ans;
        TrieNode *root = new TrieNode();
        for (int i = 0; i < n; i++)
            insert(contact[i], root);
        for (int i = 0; i < s.length(); i++)
            ans.push_back(findit(s.substr(0, i + 1), root));
        return ans;
    }
};

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        string contact[n], s;
        for (int i = 0; i < n; i++)
        
            cin >> contact[i];
        cin >> s;

        Solution ob;
        vector<vector<string>> ans = ob.displayContacts(n, contact, s);
        for (int i = 0; i < s.size(); i++)
        {
            for (auto u : ans[i])
                cout << u << " ";
            cout << "\n";
        }
    }
    return 0;
}