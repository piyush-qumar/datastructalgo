#include<bits/stdc++.h>
using namespace std;
int fibo(int n){
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    return fibo(n-1)+fibo(n-2);
}
int letter(string c)
{
    int x=c.length();
    int sum=0;
    for(int i=0;i<x;i++)
    {
        int a=c[i]-'A';
        sum+=fibo(a);
    }
    return sum;
}
int main()
{
    string string;
    cin>>string;
    int n=string.length();
    if(n==0)
    {
        cout<<"0";
        return 0;
    }
    cout<< letter(string);
}