import java.sql.*;
import java.util.*;

public class DMLPractice {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

            Statement stm=con.createStatement();

//            stm.executeUpdate("insert into dept values(70,'Chem')");
//            stm.executeUpdate("delete from dept where deptno >= 60");
//            stm.executeUpdate("update dept set dname='Chem' where deptno=50");

            Scanner sc=new Scanner(System.in);


            PreparedStatement pstm=con.prepareStatement("insert into students values(?,?,?,?)");
            int rollno,dno;
            String name,city;
            System.out.println("Enter the Student Details - ");
            System.out.println("Enter roll no :");
            rollno=sc.nextInt();
            System.out.println("Enter name :");
            name=sc.next();
            System.out.println("Enter city :");
            city=sc.next();
            System.out.println("Enter dept no :");
            dno=sc.nextInt();

            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            pstm.setInt(1,rollno);
            pstm.setString(2,name);
            pstm.setString(3,city);
            pstm.setInt(4,dno);

            pstm.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
