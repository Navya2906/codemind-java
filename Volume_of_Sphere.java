import java.util.Scanner;
public class Sphere
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double v=(1.33333333333)*(3.14)*(r*r*r);
        float f=(float)v;
        double round=Math.round(v*100.0)/100.0;
        System.out.printf("%.2f",v);
    }
}