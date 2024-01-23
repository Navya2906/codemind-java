import java.util.*;
public class GrossSalary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n<=10000) 
        {
            double gs1=n+0.8*n+0.2*n;
            System.out.printf("%.2f",gs1);
        }
        else if(n<=20000)
        {
            double gs2=n+0.9*n+0.25*n;
            System.out.printf("%.2f",gs2);
        }
        else if(n>20000)
        {
            double gs3=n+0.95*n+0.3*n;
            System.out.printf("%.2f",gs3);
        }
    }
}