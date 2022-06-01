import java.lang.*;
import java.util.*;
class student{
   int usn;
   String name;
   double perc;
   public void read()
   {
   Scanner s=new Scanner(System.in);
   System.out.print("enter usn :");
   usn=s.nextInt();
   System.out.print("enter name :");
   name=s.next();
   System.out.print("enter marks of subject 1 :");
   perc=s.nextDouble();
   }
   public void display()
   {
   System.out.println("usn :"+usn);
   System.out.println("Name :"+name);
   System.out.println("Prcantage :"+perc);
   }
      }
