import java.util.*;
class Employee
{
    int ID;
    String name;
    String Department;
    int Salary;

    void setDetails(int ID,String name,String Department,int Salary)
    {
        this.ID=ID;
        this.name=name;
        this.Department=Department;
        this.Salary=Salary;
    }
    void showDetails()
    {
        System.out.println("employee ID: "+this.ID);
        System.out.println("employee name: "+this.name);
        System.out.println("employee's department: "+this.Department);
        System.out.println("employee's salary: "+this.Salary);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the employee ID: ");
        int ID=sc.nextInt();
        sc.nextLine();
        System.out.println("Enetr the employee name: ");
        String name=sc.nextLine();
        System.out.println("Enetr the employee's department: ");
        String Department=sc.nextLine();
        System.out.println("Enetr the employee's Salary: ");
        int Salary=sc.nextInt();

        Employee E=new Employee();
        E.setDetails(ID,name,Department,Salary);
        E.showDetails();
    }
}