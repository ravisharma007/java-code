import java.util.*;
public class StudentExcercise1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();

        //String username = str.substring(0,4);
        //String domain = str.substring(5,14);

        int atTheRate = str.indexOf('@');
        String username = str.substring(0,atTheRate);
        String domain = str.substring(atTheRate+1);
        System.out.println(atTheRate);
        System.out.println(username);
        System.out.println(domain);

        boolean isDomainGmail = str.matches(".*gmail.*");
        System.out.println(isDomainGmail);

       /* boolean isGmail =domain.matches("gmail.com*");

        System.out.println(username+" "+domain);
        System.out.println(isGmail); */

    }
}
