import java.util.*;
public class DigitToWords {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        //int temp=x;
        int rev=0,r;
        String str="";

        while(x>0)
        {
            r=x%10;
            x=x/10;
           // rev=rev*10;
            //rev=rev+r;
            str=str+r;
        }
        System.out.println(str);

        for(int i= str.length()-1;i>=0;i--)
        {
            char c=str.charAt(i);
            switch (c)
            {
                case '0':
                    System.out.println("zero");
                    break;
                case '1' :
                    System.out.println("One");
                    break;
                case '2' :
                    System.out.println("Two");
                    break;
                case '3' :
                    System.out.println("Three");
                    break;
                case '4' :
                    System.out.println("Four");
                    break;
                case '5' :
                    System.out.println("Five");
                    break;
                case '6' :
                    System.out.println("Six");
                    break;
                case '7' :
                    System.out.println("Seven");
                    break;
                case '8' :
                    System.out.println("Eight");
                    break;
                case '9' :
                    System.out.println("Nine");
                    break;


            }
        }
    }
}
