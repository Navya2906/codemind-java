import java.util.*;
public class DiskCapacity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=(2*a*b*c*512)/1024;
        System.out.println(d+" KB");
    }
}