import java.net.*;
import java.io.*;
import java.util.*;

public class ReverseEcho {
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(2000);
        System.out.println("Server is Created ------");

        Socket stk=ss.accept();
        System.out.println("Connection is established with Server--------");

        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do
        {
            msg=br.readLine();

            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();

            ps.println(msg);

        }while(!msg.equals("dne"));

        ps.close();
        br.close();
        stk.close();
        ss.close();
    }
}

class Client
{
    public static void main(String[] args) throws Exception
    {
        Socket stk=new Socket("localhost",2000);

        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;

        do {
            msg= keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server : "+msg);


        }while (!msg.equals("dne"));

        ps.close();
        br.close();
        stk.close();
    }
}
