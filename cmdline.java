import java.lang.*;
class sttic{
   public static void print()
   {
      System.out.println("in static method");
     }
     static int x;
   public static void main(String args[])
   {
      sttic.print();
      x=20;
      System.out.println(x);
   }
   }
