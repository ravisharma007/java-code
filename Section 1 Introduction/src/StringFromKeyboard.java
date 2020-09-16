import java.lang.*;
import java.util.*;

public class StringFromKeyboard {
    public static void main(String[] args){

        System.out.println("This is the Demonstration of how to take String from keyboard-");
        Scanner sc=new Scanner(System.in);

        String name;
        System.out.println("Enter Your first name :");
        name=sc.next();
        System.out.println("My name is " + name);

        System.out.println("Enter your Full Name :");
        sc.nextLine(); // This is because so that nextLine() will not Skip my input from keyboard
        name=sc.nextLine();
        System.out.println("Your Full Name is : " + name);
    }
}
