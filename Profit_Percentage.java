import java.util.*;
public class profit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=y-x;
        double lp=(z/x)*100;
        System.out.printf("%.2f",lp);
    }
}