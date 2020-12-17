import jdk.swing.interop.SwingInterOpUtils;

public class NestedPattern3 {
    public static void main(String[] args)
    {
        int i,j;

//        for(i=1;i<=5;i++)
//        {
//            for(j=1;j<=5;j++)
//            {
//                if(i>j)
//                {
//                    System.out.print(" ");
//                }
//                else
//                    System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for(i=1;i<=5;i++)
//        {
//            for(j=1;j<=5;j++)
//            {
//                if(i+j>5)
//                {
//                    System.out.print("*");
//                }
//                else
//                    System.out.print(" ");
//            }
//            System.out.println("");
//        }


//        for(i=1;i<=5;i++)
//        {
//            for (j = 1; j <= 5; j++)
//            {
//                if (i + j > 6) {
//                    System.out.print("*");
//                } else
//                    System.out.print(" ");
//            }
//                for (j = 1; j <= i; j++)
//                {
//                    System.out.print("*");
//                }
//
//            for (j = i; j < i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

    //=============Below Pattern =============//
//        *
//       ***
//      *****
//     *******
//    *********
//     *******   below
//      *****
//       ***
//        *

        // Upper half code
        for(i=1;i<=5;i++)
        {
            for (j = 1; j <= 5; j++)
            {
                if (i + j > 5) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            for (j = 1; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

//bellow half code:

        for(i=1;i<=4;i++)
        {
            System.out.print(" ");
            for (j = 1; j <= 4; j++)
            {
                if (i <=j)
                {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            for(j=1;j<=3-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
