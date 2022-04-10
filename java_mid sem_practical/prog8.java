class Student {
    int ID;
    String Name;
    String Branch;
    String City;
    String University;
    
    Student(int I)
    {
        ID=I;
    }
    Student(int I, String N)
    {
        this(I);
        Name=N;
    }
    Student(int I,String N, String B)
    {
        this(I,N);
        Branch=B;
    }
    Student(int I,String N,String B,String C)
    {
        this(I,N,B);
        City=C;
    }
    Student(int I,String N, String B,String C,String U)
    {
        this(I,N,B,C);
        University=U;

    }
    void display()
    {
        System.out.println("Student ID is: "+ID);
        System.out.println("Name of the Student is: "+Name);
        System.out.println("Branch is : "+Branch);
        System.out.println("City is : "+City);
        System.out.println("University is : "+University);
    }
    public static void main(String args[])
    {
        Student obj= new Student(20011351,"Abhishek Rana","Btech Cse","Dehradun","GEHU");
        obj.display();
    }
    
}
