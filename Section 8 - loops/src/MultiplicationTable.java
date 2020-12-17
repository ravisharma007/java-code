import java.util.*;
 public class MultiplicationTable {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Multiplication Table -");
         System.out.println("Enter the value: ");
         int x=sc.nextInt();

         int mult;
         for(int i=1;i<=10;i++)
         {
             mult=5;
             mult=mult*i;
             System.out.println(mult);
         }
     }
}
