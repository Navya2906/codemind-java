import java.util.*;
public class SumOfSeries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0.0;
        for(double i=1;i<=n;i++)
        {
            sum+=1/i;
        }
        System.out.printf("%.2f",sum);
    }
}