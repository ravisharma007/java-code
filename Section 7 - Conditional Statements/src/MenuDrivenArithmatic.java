import java.util.*;
public class MenuDrivenArithmatic {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu Driven Arithmetic Program");
        System.out.println("Enter 2 number :");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Enter which operation you want to perform in words (ADD,SUB,MUL,DIV) :");
        String word=sc.next();

        switch(word)
        {
            case "ADD" :
                System.out.println(x+y);
                break;
            case "SUB" :
                System.out.println(x-y);
                break;

            case "MUL" :
                System.out.println(x*y);
                break;

            case "DIV" :
                System.out.println(x/y);
                break;
            default :
                System.out.println("Invalid input");
                break;
        }
    }
}
