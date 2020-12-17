import java.util.*;
public class StudentChallenge2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //====left Rotation of Array=====
        //int A[]={2,4,6,8,10};
//        int t=A[0];
//        for(int i=1;i<A.length;i++)
//        {
//            A[i-1]=A[i];
//        }
//        A[A.length-1]=t;
//        for(int x:A)
//        {
//            System.out.println(x);
//        }

        //===== Right Rotation=========

//        int t=A[A.length-1];
//        for(int i=A.length-1;i>0;i--)
//        {
//            A[i]=A[i-1];
//        }
//        A[0]=t;
//        for(int x:A)
//        {
//            System.out.println(x);
//        }

        //=========Inserting an element at a particular place=======
//        int A[]={2,5,7,8,10,0,0,0,0};
//        int n=5;
//        System.out.println("Enter where you want to Insert an element : ");
//        int ele=sc.nextInt();
//        System.out.println("Enter the index where you want to insert :");
//        int index = sc.nextInt();
//
//        for(int i=n-1;i>=index;i--)
//        {
//            A[i+1]=A[i];
//        }
//        A[index]=ele;
//        for(int x: A)
//        {
//            System.out.print( x +"," );
//        }

        //======== Delete an element from given index======

        int A[]={2,5,7,8,10,0,0,0,0};
        int n=5;
        System.out.println("Enter where you want to Delete an element : ");
        int index=sc.nextInt();
        int x;
        x=A[index];
        for(int i=index; i<n;i++)
        {
            A[i]=A[i+1];

        }
        n--;
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i] + ",");
        }





    }
}
