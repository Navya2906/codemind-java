import java.util.*;
public class inches
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=a*2.54;
        System.out.printf("%.2f",b);
    }
}