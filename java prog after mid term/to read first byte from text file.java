import java.io.*;
class Abc
{
   public static void main(String args[]) throws IOException
   {
       FileInputStream Fis=new FileInputStream("/home/gehu/text1.txt");

       int x=Fis.read();
       System.out.println((char)x);
       
       Fis.close();
    }
}
