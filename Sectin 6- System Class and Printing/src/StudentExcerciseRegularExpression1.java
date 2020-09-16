import java.util.*;
public class StudentExcerciseRegularExpression1 {
    public static void main(String[] args)
    {
        //Scanner sc=new Scanner(System.in);
       // int Binary = sc.nextInt();
        String Binary = "0001";

        boolean checkBinary = Binary.matches("[0-1]*");
        System.out.println(checkBinary);

        String HexaDecimal="1a";
        boolean checkHexa = HexaDecimal.matches("[0-9a-f]*");
        System.out.println(checkHexa);

        String date="16/12/2020";
        boolean checkDate = date.matches("(0?[1-9]|[12][0-9]|[3][01])/(0?[1-9]|[1][012])/(\\d{4})");

        System.out.println(checkDate);
    }
}
