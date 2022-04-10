import java.util.Scanner;
class Student
{
   int roll;
   String name;
   String branch;
   static String Uname="Gehu";
   
   void set(String nm, String br, int r)
   {
       name=nm;
       branch=br;
       roll=r;
   }
   
   void display()
   {
       System.out.println("The entered data is:\n ");
       System.out.println("Name of student "+name+"\n");
       System.out.println("Roll no. is: "+roll+"\n");
       System.out.println("Branch: "+branch+"\n");
       System.out.println("University name : "+Uname+"\n");
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