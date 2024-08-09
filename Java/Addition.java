import java.util.*;

class Addition
{
	public static void main(String arr[ ])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a= Integer.parseInt(sc.nextLine());
		System.out.println("Enter Second Number: ");
		int b= Integer.parseInt(sc.nextLine());
		int c= a+b;
		System.out.println("Addition of two numbers is: "+ c);
	}

}


/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1= sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2= sc.nextInt();
		System.out.println("Addition of "+ num1+ " and "+ num2+ "= "+ (num1+num2));
*/
