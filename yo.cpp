//you have n strings and the characters of each string follow a pattern. for example we have ACB,BDC,CED  and DEF. DEF is the odd string in this array?
#include<bits/stdc++.h>
using namespace std;
class yo{
    private:
    int age;
    string name;
    public:
    string getname(){
        return name;
    }
    int getage(){
        return age;
    }
    void printi()
    {
        cout<<name<<" "<<age<<endl;
    }
    yo(string Name,int Age)
    {
        name=Name;
        age=Age;
    }
};
int main(){
    yo yo1=yo("hari poddar",15);
    cout<<yo1.getname()<<" is "<<yo1.getage()<<" years old"<<endl;
    // yo1.age=15;
    // yo1.name="yo";
    yo1.printi();
    return 0;
}