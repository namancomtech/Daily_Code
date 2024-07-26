//Program for converting student's marks of all subjects
// into Overall Percentage.
import java.util.Scanner;
public class CBSE_Per_Cal
{
    public static void main()
    {
        System.out.println("CBSE Percentage Calculator");
        System.out.println("============================");
        Scanner obj= new Scanner(System.in);
        System.out.println("What is your Name: ");
        String student_name= obj.nextLine();
        System.out.println("How many Subjects you have?: ");
        int num= obj.nextInt();
        int total_max_marks= 0;
        int total_obt_marks= 0;
        
        while(num!=0)
        {
            obj.nextLine();
            System.out.println("Enter "+num+" Subject Name: ");
            String Sub_name= obj.nextLine();
            System.out.println("Maximum marks: ");
            int max_marks= obj.nextInt();
            System.out.println("Obtained marks: ");
            int obt_marks= obj.nextInt();
            total_obt_marks += obt_marks;
            total_max_marks += max_marks;
            num -=1;
        }

          double cal= (double)total_obt_marks/total_max_marks *100;
          System.out.println(student_name+"  Percentage is= "+cal+"%");

    }
}