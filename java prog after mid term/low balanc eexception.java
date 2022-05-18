import java.util.*;
class LowBalanceException extends RuntimeException
{
    LowBalanceException(String s)
    {
         super(s);
    }
}

class Xy
{
    int bal=1000;
    void withdrawl(int amt)
    {
         if(bal<amt)
          {
               throw new LowBalanceException("Insufficient Balance");
           }
     }

    public static void main(String args[])
    {    
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the current amount");
         int x= sc.nextInt();
         Xy d= new Xy();
         d.withdrawl(x);
    }
}
