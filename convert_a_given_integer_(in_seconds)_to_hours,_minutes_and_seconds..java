import java.util.*;
public class hours
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long c=a/3600;
        System.out.printf("H:");
        long b=(a%3600)/60;
        System.out.printf("M:");
        long d=a%60;
        System.out.printf("S-");
        System.out.printf("%d:",c);
        System.out.printf("%d:",b);
        System.out.printf("%d",d);
        
    }
}