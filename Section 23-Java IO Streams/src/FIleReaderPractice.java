import java.io.FileReader;

public class FIleReaderPractice {
    public static void main(String[] args) throws Exception
    {
        try(FileReader fr=new FileReader("C:/Users/dshar/Desktop/Myjava/Test.txt"))
        {
            int x;
            while((x=fr.read()) != -1)
            {
                System.out.print((char)x);
            }
        }
    }
}
