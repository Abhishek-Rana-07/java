import java.util.*;
class Jagg_Array {
    public static void main(String args[])
    {
        int a[][]=new int[3][];
        a[0]=new int[3];
        a[1]=new int[4];
        a[2]=new int[2];

        Scanner in=new Scanner(System.in);
        System.out.println("Enetr the elemnts of Jagged array: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=in.nextInt();
            }
        }

        System.out.println("The elements of the jagged array are: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
