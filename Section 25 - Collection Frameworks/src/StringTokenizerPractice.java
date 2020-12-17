import java.util.*;
import java.io.*;

public class StringTokenizerPractice {
    public static void main(String[] args) throws Exception
    {
        //file path should be valid
        FileInputStream fis=new FileInputStream("C:/Users/dshar/Desktop/Myjava/Data.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);

        String str=new String(b);
        //System.out.println(str);

        ArrayList<Integer> al=new ArrayList<>();
        String s;

        StringTokenizer st=new StringTokenizer(str,",");

        while(st.hasMoreElements())
        {
            s=st.nextToken();
            System.out.print(s+",");
            al.add(Integer.valueOf(s));
        }

        System.out.println("\nFile Data Stored in Array list:-");
        System.out.println(al);
    }
}
