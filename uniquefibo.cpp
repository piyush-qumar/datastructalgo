#include<bits/stdc++.h>
using namespace std;
int main()
{
    int x;
    cin>>x;
    x=x-2;
    int t1=2;
    int t2=8;
    
    cout<<t1<<endl<<t2<<endl;
    while(x--)
    {
        int next=2*t2-t1;
        cout<<next<<endl;
        t1=t2;
        t2=next;
    }
    return 0;

}