//WAP of multiple inheritance
//One Parent and Two Child

#include<iostream>
using namespace std;

class parent
{
    public:
    //data
    int num1,num2;
    //method
    void input()
    {
        cout << "\nEnter the First Integer Number: ";
        cin >> num1;
        cout << "\nEnter the Second Integer Number: ";
        cin >> num2;
    }

};

class child1: public parent
{
    public:
    void div()
    {
        if(num1 > num2)
        {
            cout << "\nDivided Value: " << num1 / num2;
        }
        else if(num2 > num1)
        {
            cout << "\nDivided Value: " << num2 / num1;
        }
        else
        {
            cout << "\nBoth the Numbers Are Equal. Divided Value: " << num1 / num2;
        }

    }

};

class child2: public parent
{
    public:
    void mul()
    {
        if(num1 == 0 || num2 == 0)
        {
            cout << "\nYou have Entered 0(Zero).\nThe Answer will be Zero!!";
        }
        else if(num1 == 0 && num2 == 0)
        {
            cout << "\nNum1 and Num2 Both are Zero!!";
        }
        else
        {
            cout << "\nMultiplied Value: " << num1 * num2;
        }
    }


};


int main()
{
    child1 obj1;
    obj1.input();
    obj1.div();

    child2 obj2;
    obj2.input();
    obj2.mul();


    return 0;
}