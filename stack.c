#include<stdio.h>
#include<stdlib.h>
#define size 10

int stack[size];    //Global Variable Declaration;
int top = -1;       //Global Variable Declaration and Initialization;
// Function Definition
void push()
{
  char repeat;
  if(top == size-1)
  {
    printf("\nOverflow.(Stack is Full)");
  }
  else
  {
    printf("\nEnter an Element: ");
    int x;
    scanf("%d",&x);  // suppose use enter: 10
                     // Then "10\n" stored in Input Buffer
    top= top+1;
    stack[top]= x;

    while((getchar()) != '\n'); //it removes "10" from the Input Buffer
                                //Or, cleares the Input Buffer data
                                //Except,'\n' whitespace character.

    printf("\nWant to enter more?(y or n): ");
    // scanf("%c",&repeat); does not remove the whitespace characters
    // previously stored in the Input Buffer.
    //whitespace characters like: \n,\t,space etc.

    // So, we use this instead:

    scanf(" %c",&repeat);

    //" %c" : the space before "%c" tells the compiler that
    // this statement should remove the whitespace characters
    // before entering the character input from the user.
                          
    if(repeat == 'Y' || repeat == 'y')
    {
        push();
    }
    else if(repeat == 'N' || repeat == 'n')
    {
       printf("\nOk, No Issues...\n"); 
       ;
    }
  }

}


void pop()
{
    if(top == -1)
    {
        printf("UnderFlow.(Stack is Empty)");
    }
    else
    {
        printf("\nDeleted Element: ");
        printf("%d",stack[top]);
        top= top-1;
    }
}

void show()
{
    if(top == -1)
    {
        printf("\nUnderFlow.(Stack is Empty)");
    }
    else
    {
        printf("\nElements in the Stack are shown below:\n");
        int i;
        for(i=top;i>=0;i--)
        {
            printf("%d",stack[i]);
            printf("\n");
        }
    }
}


// Program Execution starts from here.

int main()
{
    int choice;
    while(1)
    {
        printf("\n1 for Push: ");
        printf("\n2 for Pop: ");
        printf("\n3 for Show: ");
        printf("\n4 for Exit: ");
        printf("\nSelect any one option from the above: ");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1: push();
                    break;
            case 2: pop();
                    break;
            case 3: show();
                    break;
            case 4: exit(0);
                    break;
            default: printf("\nWrong Choice\a");
        }
    }

    return 0;
}