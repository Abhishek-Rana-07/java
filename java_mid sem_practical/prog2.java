import java.util.Scanner;
class Account
{
    int AccNo;
    String name;
    int ammount;

    void insert(int x,String y,int z)
    {
        AccNo=x;
        name=y;
        ammount=z;
    }
    void deposit(int dep)
    {
        ammount+=dep;
    }

    void withdraw(int wd)
    {
        System.out.println("the amount to be withdrawn is: "+wd);
        if(wd<ammount)
        {
            ammount-=wd;
        }
        else
        {
            System.out.println("Amount cannot be withdrawn: ");
        }
    }

    void checkbalance()
    {
        System.out.println("Balance is: "+ammount);
    }
    void display()
    {
        System.out.println(" the account number is: "+AccNo);
        System.out.println("the account holder's name is: "+name);
        System.out.println("the amount in account is: "+ammount);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account number: \n");
        int x=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the account holder's name: \n");
        String y=sc.nextLine();
        System.out.println("Enter the amount: \n");
        int z=sc.nextInt();
        System.out.println("Enter the ammount to be deposited: \n");
        int dep=sc.nextInt();
        System.out.println("Enter the ammount to be withdrawn: \n");
        int w=sc.nextInt();

        Account d=new Account();
        d.insert(x,y,z);
        d.deposit(dep);
        d.withdraw(w);
        d.checkbalance();
        d.display();
    }
}
