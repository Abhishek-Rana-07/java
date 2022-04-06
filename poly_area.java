class Shape
{
    void area(float r)
    {
        double area=3.14*r*r;
        System.out.println("Area of circle is: "+area);        
    }
    void area(int a)
    {
        int area=a*a;
        System.out.println("Area of square is: "+area);
    }
    void area(float l,float b)
    {
        float area=l*b;
        System.out.println("Area of rectangle is: "+area);
    }
    void area(int b,int h)
    {
        int area=(1/2)*b*h;
        System.out.println("Area of triangle is: "+area);
    }
    public static void main(String args[])
    {
       Shape d=new Shape();
       d.area(3.6f);
       d.area(5);
       d.area(4.2f,2.6f);
       d.area(2,3);
    }
}
