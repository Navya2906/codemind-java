import java.util.*;
public class Years
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int years=a/365;
        System.out.println(years);
        int weeks=(a%365)/7;
        System.out.println(weeks);
    }
}