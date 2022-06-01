import java.lang.*;
import java.util.*;
class student{
   int usn;
   String name;
   double perc;
   public void read()
   {
   Scanner s=new Scanner(System.in);
   System.out.print("enter usn");
   usn=s.nextInt();
   System.out.print("enter name");
   name=s.nextLine();
   System.out.print("enter percantage");
   perc=s.nextDouble();
   }
   public void display()
   {
   System.out.println("usn :"+usn);
   System.out.println("Name :"+name);
   System.out.println("Prcantage :"+perc);
   }
   public static void main(String args[])
   {
   student s=new student();
   s.read();
   s.display();
         }
   }
