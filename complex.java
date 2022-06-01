import java.lang.*;
import java.util.*;
class complex{
   int r,i;
   public void read()
   {
   Scanner s=new Scanner(System.in);
   System.out.print("enter real part :");
   r=s.nextInt();
   System.out.print("enter imaginary part :");
   i=s.nextInt();
   }
   public void display()
   {
   System.out.println(r+" + "+i+"i");
      }
      
    public complex add(complex c1)
    {
      complex c=new complex();
      c.i=i+c1.i;
      c.r=r+c1.r;
      return c;
      }
      }      
class demostud
{
public static void main(String args[])
   {
  complex c=new complex();
  c.read();
  complex c1=new complex();
  c1.read();
  complex c3=c.add(c1);
  c3.display();
   }
   
   }

