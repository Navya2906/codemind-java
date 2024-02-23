import java.util.Scanner;
import java.util.Arrays;
public class MatrixAddition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] arr1=new int[a][b];
        int[][] arr2=new int[a][b];
        int[][] arr3=new int[a][b];
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        int c=sc.nextInt();
        int d=sc.nextInt();
        for(i=0;i<c;i++)
        {
            for(j=0;j<d;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                 System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}