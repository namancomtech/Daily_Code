//DL Information Gathering Tool
//By Naman Sharma
import java.util.Scanner;
import java.time.LocalDate;
public class DL
{
    public static void main(String[] args)
    {
        System.out.println("Driving License\nInformation Gathering Tool.");
        System.out.println("==============================");
        System.out.print("What is your Name ?: ");
        Scanner obj= new Scanner(System.in);
        String name= obj.nextLine();
        System.out.print("Please Tell me your Age: ");
        int age= obj.nextInt();
        obj.nextLine(); //for clearing the \n from the stack
        if(age >= 18)
        {
            System.out.print("Do you have a Driving License?(yes or no): ");
            String is_DL= obj.nextLine();
            if(is_DL.equals("yes"))  //.equals() returns boolean true or false.
            {
                System.out.print("Write your DL no.: ");
                String DL_num= obj.nextLine();
                System.out.print("Enter your DOB in YYYY-MM-DD format: ");
		        String userGivenDate = obj.nextLine();
		        LocalDate dob = LocalDate.parse(userGivenDate);

            }
            else if(is_DL.equals("no"))
            {
                System.out.println("No issues,\nGet your DL from Maruti Suzuki Training Center!!");
                System.out.println("Did you have the Learning License?(yes or no): ");
                String is_LL= obj.nextLine();
                if(is_LL.equals("yes"))
                {
                    System.out.println("Great, then No problem.\nJust Train yourself and\ngive the competitive DL practical Test.");
                    System.out.println("For any Enquiry,\nCall me on 9355184969");
                }
                else if(is_LL.equals("no"))
                {
                    System.out.println("Visit this Link\nfor applying the Learning License:\nhttps://sarathi.parivahan.gov.in/sarathiservice/stateSelection.do");
                }
                else
                {
                    System.out.println("Wrong Input Error\nKindly check your Input.");
                }
                
            }
            else
            {
                System.out.println("Wrong Input Error\nKindly check you Input.");
            }
        }
        else
        {
            System.out.print("Enter your DOB in YYYY-MM-DD format: ");
		    String userGivenDate = obj.nextLine();
		    LocalDate dob = LocalDate.parse(userGivenDate);
            System.out.printf("Sorry you are UnderAge.\nTry Again, after becoming 18 years Old!!");
        }
    }
}