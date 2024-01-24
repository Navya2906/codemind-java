import java.util.*;
public class CarChoice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            if(x1/(float)y1>x2/(float)y2)
            {
               System.out.println(-1);
            }
            if(x1/(float)y1==x2/(float)y2)
            {
               System.out.println(0);
            }
            if(x1/(float)y1<x2/(float)y2)
            {
               System.out.println(1);
            }
        }
        }
    }