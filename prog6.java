import java.util.Scanner;
class Student
{
   int roll;
   String name;
   String branch;
   static String Uname="Gehu";
   
   void set(String name, String branch, int roll)
   {
       this.name=name;
       this.branch=branch;
       this.roll=roll;
   }
   
   void display()
   {
       System.out.println("The entered data is:\n ");
       System.out.println("Name of student "+this.name+"\n");
       System.out.println("Roll no. is: "+this.roll+"\n");
       System.out.println("Branch: "+this.branch+"\n");
       System.out.println("University name : "+this.Uname+"\n");
   }
   public static void main(String args[])
   {
       Student obj=new Student();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name=sc.nextLine();
       System.out.println("Enter your roll number ");
       int roll=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter branch:");
       String branch=sc.nextLine();
       
       obj.set(name,branch,roll);
       obj.display();
       
   }
}
