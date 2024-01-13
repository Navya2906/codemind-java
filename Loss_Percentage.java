import java.util.*;
public class loss
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=x-y;
        double lp=(z/x)*100;
        System.out.printf("%.2f",lp);
    }
}