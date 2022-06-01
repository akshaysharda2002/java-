import java.lang.*;
import java.util.*;
class item{
   String desc;
   int units;
   double price;
   
   item()
   {
   desc="";
   units=0;
   price=0;
   }
   item(String d,int u,int p)
   {
   desc=d;
   units=u;
   price=p;
   }
   public void read()
   {
     Scanner s=new Scanner(System.in);
     System.out.print("enter description of product");
     desc=s.next();
     System.out.print("enter price of product");
     price=s.nextDouble();
     System.out.print("enter number of units of product");
     units=s.nextInt();
    }
    public void display()
    {
      System.out.println(desc+"\t"+price+"\t"+units);
      }
     public static void main(String args[])
     {
         item i1=new item();
         i1.read();
         item i2=new item("apple",5,35);
         item i3=new item("orange",10,15);
         System.out.println("product\tprice\tunits");
         i1.display();
         i2.display();
         i3.display();
         }
         }
         
