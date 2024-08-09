//WAP in java for Calculator.

import java.util.*;

class Calculator
{
	public static void main(String args[ ])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1= obj.nextInt();
		System.out.print("Enter Second Number: ");
		int num2= obj.nextInt();
		System.out.println(" 1: Addition");
		System.out.println(" 2: Substraction");
		System.out.println(" 3: Multiplication ");
		System.out.println(" 4: Division ");
		System.out.println(" 5: Exit");
		System.out.println(" Enter your Choice: ");
		int choice= obj.nextInt();	

		switch(choice)
	{
			
		case 1: System.out.println("Sum is= "+ (num1+num2) ); break;

		case 2:

 		if(num1>num2)
		{
			System.out.println(" Substraction is= "+ (num1-num2) ); break;
		}
		else if(num2>num1)
		{
			System.out.println(" Substraction is= "+ (num2-num1) ); break;
		}
		else if(num1==num2)
		{
			System.out.println(" Both Numbers are Equal !! " ); break;
		}
		else
		{
			System.out.println(" Wrong Input "); break;
		}

		case 3: System.out.println("Multiplication is= "+ (num1*num2) ); break;

		case 4: 
		if(num1>num2)
		{
			System.out.println("Division is= "+ (num1/num2) ); break;
		}
		else if(num2>num1)
		{
			System.out.println("Division is= "+ (num2/num1) ); break;
		}

		case  5: System.exit(1); break;		
		default: System.out.println(" Invalid Choice !! " );
	}	
		

	}

}