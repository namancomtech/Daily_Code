//WAP of single inheritance.

#include<iostream>
using namespace std;
#include<stdlib.h>

class one
{   
    public:
    //data
    int a,b;
    //function 
    void input()
    {
        cout << "Enter the values of A and B: ";
        cin >> a >> b;
    }

};

class two: public one
{   
    public:
    void calculator()
    {   
        while(1)
        {
        int choice;
        cout << "\nWELCOME TO NAMAN COMTECH 's CALCULATOR";
        cout << "\nChoose 1 for Addition";
        cout << "\nChoose 2 for Substraction";
        cout << "\nChoose 3 for Multiply";
        cout << "\nChoose 4 for Exit";
        cout << "\nEnter your Choice: ";
        cin >> choice;
        
        switch(choice)
        {
            case 1: cout << "Addition of a & b are: " << a+b;
                    break;
            case 2: cout << "Substraction of a & b are: " << a-b;
                    break;
            case 3: cout << "Multiplication of a & b are: " << a*b;
                    break;
            case 4: exit(0);
                    break;
            default:    cout << "Wrong Choice!! Please Recheck your Choice.";
        }

        }

    }

};

int main()
{
    two ob;
    ob.input();
    ob.calculator();

    return 0;
}

