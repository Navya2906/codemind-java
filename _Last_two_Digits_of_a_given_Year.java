import java.util.*;
public class Last
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=a%100;
        System.out.printf("%02d",b);
    }
}