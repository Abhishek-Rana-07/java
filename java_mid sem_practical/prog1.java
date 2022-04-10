class Student{
    String name;
    int ID;
    String branch;
    String Uname;
    
    void setDetails(String x, int y,String z,String w)
    {
        name=x;
        ID=y;
        branch=z;
        Uname=w;
    }

    void showDetails(){
        System.out.println("Name: "+name+"\nID number: "+ID+"\nBranch: "+branch+"\n University name "+Uname);
    }
    public static void main(String args[])
    {
        String x=args[0];
        int y=Integer.parseInt(args[1]);
        String z=args[2];
        String w=args[3];

        Student d=new Student();
        d.setDetails(x,y,z,w);
        d.showDetails();
    }
}