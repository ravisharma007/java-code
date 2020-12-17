import java.util.*;
public class StudentChallenge {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter the Value : ");
        int x=sc.nextInt();

        if(x>=0) {
            if ((x % 2) == 0) {
                System.out.println(x + " Number is even");
            } else {
                System.out.println(x + " Number is odd");
            }
        }
        else
        {
            System.out.println("Invalid input");
        } */

        //====================================================
        // Person is Young or not---
       /* System.out.println("Enter age : ");
        int age= sc.nextInt();

        if(age>0 && age<= 100)
        {
            if(age <=12 && age >= 1)
            {
                System.out.println("Person is KID");
            }
            else if(age >12 && age<=19)
            {
                System.out.println("Person is teenager");
            }
            else
            {
                System.out.println("Person is an Adult");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        } */

        //================== Grades For Given MArks =================
        System.out.println("Enter the marks obtained :");
        int marks=sc.nextInt();

        if(marks >=0 && marks <=100)
        {
            if(marks <=40 && marks >=30)
            {
                System.out.println("Grade : 'C' ");
            }
            else if(marks <30)
            {
                System.out.println("Grade : 'F' ");
            }
            else if(marks >40 && marks <=60)
            {
                System.out.println("Grade : 'B' ");
            }
            else if(marks >60)
            {
                System.out.println("Grade : 'A' ");
            }

        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
