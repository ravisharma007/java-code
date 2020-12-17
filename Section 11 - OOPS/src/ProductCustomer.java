import java.awt.desktop.PrintFilesEvent;
import java.lang.*;

class Product
{
    private int itemno;
    private String nameofproduct;
    private double price;
    private int qty;

    public Product(int i)
    {
        itemno=i;
        nameofproduct="Soap";
        price=10;
        qty=0;
    }

    public Product(int i,String n)
    {
        itemno=i;
        qty=0;
        nameofproduct=n;
        price=10;

    }

    public void setPrice(int p)
    {
        price=p;
    }

    public void setQty(int q)
    {
        qty=q;
    }
    public int getItemno()
    {
        return itemno;
    }
    public String getNameofproduct()
    {
        return nameofproduct;
    }
    public double getPrice()
    {
        return price;
    }

    public int getQty()
    {
        return qty;
    }

    public double totalPrice()
    {
        return qty*price;
    }
}
public class ProductCustomer {
    public static void main(String[] args)
    {
        System.out.println("Producer consumer example: ");
        Product p1=new Product(001,"soap");
        p1.setQty(3);

        System.out.println("Total Price of Product : " + p1.totalPrice());
        System.out.println("quantity : " + p1.getQty());
    }
}
