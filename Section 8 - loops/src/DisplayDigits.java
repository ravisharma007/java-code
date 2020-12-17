import java.util.*;
public class DisplayDigits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digits of an number : ");
        System.out.println("Enter the number and length of number");
        int x=sc.nextInt(); //153
        //int n=sc.nextInt();
        int temp=x,j=1,count=0;
        int pow,sum=0;

        /*for(int i=1; i<=n;i++)
        {
            temp=x;
            temp=(temp/j)%(10);
            System.out.println(temp);
            j=j*10;
        } */

        //=========== Using While Loop, when we don't know the no. of digits======

        //<editor-fold desc="some comments">
      /*  while((temp/j)!=0)
        {
            temp=(temp/j)%10;
            System.out.println(temp);
            temp=x;
            j=j*10;
            count++;
        }
        System.out.println("Number of Digits are : "+ count);  */

        //=====Armstrong checking==================

      /*  while((temp/j)!=0)
        {
           // temp=temp/j;
            count++;
            j=j*10;
            temp=x;
        }
        System.out.println(count);
        temp=x;
        j=1;

        while((temp/j)!=0)
        {
            temp=(temp/j)%10;
            pow=1;
            //sum=0;
            for(int i=1;i<=count;i++)
            {
                pow=pow*temp;
            }
            sum=sum+pow;
            temp=x;
            j=j*10;
        }

        if(sum==x)
            System.out.println("Number is Armstrong : " + sum);
        else
            System.out.println("Number is not Armstrong and result is : " + sum); */
        //</editor-fold>

//        ======================= Reverse a given Number==================
        int rev=0,flag=0;

        /*while((temp/j!=0))
        {
            count++;
            j=j*10;
            temp=x;
        }
        //System.out.println(count);
        temp=x;
        j=1;
        while((temp/j)!=0)
        {
            temp=(temp/j)%10;

            if(flag==0)
            {
                rev=temp*10;
            }
            else if(flag < count-1)
            {
                rev=rev+temp;
                rev=rev*10;
            }
            else
            {
                rev=rev+temp;
            }
            flag++;
            temp=x;
            j=j*10;
        }*/

        //======== Code By Bhanu Bhai===================
        /*while(x > 0){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        System.out.println(rev); */


    }
}
