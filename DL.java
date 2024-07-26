//nextInt() of Scanner class in Java is used for taking int as input from user.
import java.util.Scanner;
public class DL
{
    public static void main(String[] args)
    {
        System.out.println("DL_Information_Gathering Tool");
        System.out.println("-----------------------------");
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age= obj.nextInt();
        obj.nextLine(); //Clears the \n from age variable.
        if(age>=18)
        {
            System.out.println("Do you have Driving License ?(yes or no): ");
            String is_dl= obj.nextLine().toLowerCase();
            if(is_dl.equals("yes"))
            {
                System.out.print("Enter your Name: ");
                String name= obj.nextLine();
                System.out.print("Tell me your DL number: ");
                String DL_num= obj.nextLine(); //because DL number also contains Alphabets in it.
            }
            else if(is_dl.equals("no"))
            {
                System.out.println("Why not?? Make it as soon as possible \n or the Police will caught you on road!!");
                System.out.println("Contact Maruti Suzuki Car/Bike Training Center for making your DL...ok!");

            }
        }
        else
        {
            System.out.println("Jaa Jakar Pogo Dekh Baalak :)");
        }
    }
}