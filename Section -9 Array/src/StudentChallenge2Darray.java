import java.util.*;
public class StudentChallenge2Darray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);



        int[] A[]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[] B[]={{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};

        //======== Matrix Addition================

//        int C[][]=new int[A.length][A[0].length];
//
//        for(int i=0;i<A.length;i++)
//        {
//            for(int j=0;j<A[0].length;j++)
//            {
//                C[i][j]=A[i][j]+B[i][j];
//                System.out.print(C[i][j] + " ");
//            }
//            System.out.println("");
//        }

        //============== Multiply 2 Matrices ============

        int C[][]=new int[A.length][A[0].length];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                for(int k=0;k<A.length;k++)
                {
                    C[i][j]= C[i][j] + (A[i][k] * B[k][j]);

                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
