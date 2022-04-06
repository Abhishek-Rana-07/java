class Bank
{
    float getROI()
    {
         return 0;
    }
}
class HDFC extends Bank
{
    float getROI()
    {
         return 4.0f;
    }
}
class PNB  extends Bank
{
    float getROI()
    {
         return 4.5f;
    }
}
class SBI  extends Bank
{
    float getROI()
    {
         return 5.0f;
    }
}
class Run
{
    public static void main(String args[])
    {
       Bank d;
       //System.out.println(d.getROI());
       d=new HDFC();
       System.out.println("HDFC "+d.getROI());
       d=new PNB();
       System.out.println("PNB "+d.getROI());
       d=new SBI();
       System.out.println("SBI "+d.getROI());
    }
}
