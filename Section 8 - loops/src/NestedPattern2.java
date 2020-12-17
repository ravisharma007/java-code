public class NestedPattern2 {
    public static void main(String[] args)
    {
        int i,j;
//        for(i=1;i<=5;i++)
//        {
//            for(j=1;j<=i;j++)
//            {
//                System.out.print(j + " ");
//            }
//            System.out.println("x");
//        }

//        int c=1;
//        for(i=1;i<=5;i++)
//        {
//            for(j=1;j<=i;j++)
//            {
//                System.out.print((c++) + " ");
//            }
//            System.out.println("");
//        }

//        int c;
//        for(i=1;i<=5;i++)
//        {
//            c=1;
//            for(j=5;j>=i;j--)
//            {
//                System.out.print(c++ + " ");
//            }
//            System.out.println("");
//        }
            //================OR===================


        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5-i+1;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
