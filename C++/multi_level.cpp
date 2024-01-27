//WAP of Multi Level Inheritance.

#include<iostream>
using namespace std;

class one
{
    public:
    //data
    int a,b;
    //method
    void input()
    {
        cout << "Enter the value of A and B: ";
        cin >> a >> b;
        cout << endl;
    }

};

class two: public one
{
    public:
    //method
    void add()
    {
        cout << "Sum: " << a+b << endl;
    }

};

class three: public two
{
    public:
    void sub()
    {
        cout << "Substraction: " << a-b << endl;
    }

};

class four: public three
{
    public:
    void mul()
    {
        cout << "Multiplied Value: " << a*b << endl;
    }

};


int main()
{
    four ob;
    ob.input();
    ob.add();
    ob.sub();
    ob.mul();

    return 0;
}