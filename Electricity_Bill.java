import java.util.*;
public class ElectricityBill
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        double c=sc.nextDouble();
        if(c<=199)
        {
            double d=c*1.20+100;
            System.out.printf("%.2f",d);
        }
        else if(c>=200 && c<=400)
        {
            double e=c*1.50+100;
            System.out.printf("%.2f",e);
        }
        else if(c>=400&& c<=600)
        {
            double f=c*1.80;
            double h=f*15/100+f;
            System.out.printf("%.2f",h);
        }
        else if(c>=600)
        {
            double g=c*2.00;
            double i=g*15/100+g;
            System.out.printf("%.2f",i);
        }
    }
}