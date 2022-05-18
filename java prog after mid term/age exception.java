import java.util.*;
class AgeException extends RuntimeException
{
    AgeException(String s)
    {
         super(s);
     }
}
class Ab
{
   int a=18;
   void check(int age)
   {
          if(age<a)
         { 
              throw new AgeException("Not eligible for vote");
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter ur age");
          int x=sc.nextInt();
          Ab d=new Ab();
          d.check(x);
          
    }
}
