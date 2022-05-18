import java.io.*;
class Abc
{
   public static void main(String args[]) throws IOException
   {
       FileInputStream Fis=new FileInputStream("/home/gehu/text1.txt");

       int i=0;
       while((i=Fis.read())!= -1)
        {
            System.out.print((char)i);
        }
       Fis.close();
    }
}
