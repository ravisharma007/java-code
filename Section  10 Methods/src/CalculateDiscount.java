import java.util.Scanner;

public class CalculateDiscount {

    static double discount(double ...n)
    {
        double offer=0;

        double sum=0;
        for(int i=0;i<n.length;i++)
        {
            sum=sum+n[i];
        }

        if(sum>=500 && sum <=1000)
        {
            offer=sum*10/100;
        }
        else if(sum >1000)
        {
            offer=sum*20/100;
        }

        return offer;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of products :");
        double proNo[]= new double[sc.nextInt()];
        System.out.println("Total products are : " + proNo.length);
        System.out.println("Enter the price of the above products : ");
        for(int i=0;i<proNo.length;i++)
        {
            proNo[i]=sc.nextDouble();
        }

        double discountAmount = discount(proNo);
        System.out.println("Discount amount on all products is : " + discountAmount);

    }
}
