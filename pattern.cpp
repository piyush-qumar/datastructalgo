#include<bits/stdc++.h>
using namespace std;
void print(int n)
{
    int i,j,k;
    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            cout<<" ";
        }
        for(k=65+i;k<65+n-1;k++)
        {
            cout<<char(k);
        }
        for(;k>=65+i;k--)
        {
            cout<<char(k);
        }
        cout<<endl;
    }
}
int main()
{
    int n;
    cin>>n;
    print(n);
    return 0;
}