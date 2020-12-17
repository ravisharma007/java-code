import java.io.*;
import java.util.*;
import java.net.*;

public class MultithreadedReverseEcho extends Thread {

    Socket stk;
    MultithreadedReverseEcho(Socket st)
    {
        stk=st;
    }
    public void run()
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps=new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;
            do {
                msg=br.readLine();
                sb= new StringBuilder(msg);
                sb.reverse();
                msg=sb.toString();

                ps.println(msg);

            }while (!msg.equals("dne"));

            ps.close();
            br.close();
        }
        catch(Exception e){}
    }

    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(2000);
        System.out.println("Server is Created ------");
        int count=1;

        Socket stk;
        MultithreadedReverseEcho ref;
        do {
            stk=ss.accept();
            System.out.println("Connection is established with Server-------- Count:"+ count++);
            ref=new MultithreadedReverseEcho(stk);
            ref.start();

        }while(true);
    }
}

class ClietOfMultithreaded
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Client Started---");
        Socket stk=new Socket("localhost",2000);

        BufferedReader keyb=new BufferedReader( new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;
        do {
            msg= keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server : "+msg);
        }while(!msg.equals("dne"));

        ps.close();
        br.close();
        keyb.close();
        stk.close();
    }
}