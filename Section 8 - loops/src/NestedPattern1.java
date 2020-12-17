public class NestedPattern1 {
    public static void main(String[] args)
    {
        int c=1;
        for(int i=1;i<=5;i++)
        {

            for(int j=1; j<=5; j++)
            {
                System.out.format("%02d ",c++);
            }
            System.out.println("");
        }
    }
}

