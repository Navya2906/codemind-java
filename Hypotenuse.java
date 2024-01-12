import java.util.*;
public class Hypotenuse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=(a*a)+(b*b);
        double d=Math.sqrt(c);
        double round=Math.round(d*100.0)/100.0;
        System.out.printf("%.2f",d);
    }
}