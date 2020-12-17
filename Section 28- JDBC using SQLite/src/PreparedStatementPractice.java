import java.sql.*;
import java.util.*;

public class PreparedStatementPractice {
    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

            PreparedStatement pstm=con.prepareStatement("select * from students where deptno=?");
            System.out.println("Enter the Dept no :");
            Scanner sc=new Scanner(System.in);
            int dno=sc.nextInt();

            pstm.setInt(1,dno);

            ResultSet rs=pstm.executeQuery();

            while(rs.next())
            {
                System.out.print(rs.getInt("roll") + " | ");
                System.out.print(rs.getString("name") + " | ");
                System.out.print(rs.getString("city") + " | ");
                System.out.println(rs.getInt("deptno") + " | ");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
