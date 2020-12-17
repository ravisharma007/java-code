import java.sql.*;
import java.util.*;

public class DDLPractice {
    public static void main(String[] args) {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

            Statement stm=con.createStatement();

//            stm.executeUpdate("create table resultTable(roll integer primary key not null unique ,name text,marks char)");
//            stm.executeUpdate("drop table resultTable");

            stm.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
