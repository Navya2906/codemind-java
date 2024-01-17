import java.util.*;
public class Gross
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();//Basic salary
        float b=sc.nextFloat();//hra
        float c=sc.nextFloat();//Da
        float d=12*a/100;//pf
        System.out.printf("%.2f
",d);
        float e=a+b+c+d;//Gross salary
        System.out.printf("%.2f",e);
    }
}