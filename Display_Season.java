import java.util.*;
public class DisplaySeason
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=4 && n<=6)
        {
            System.out.printf("Summer");
        }
        else if(n>=7 && n<=10)
        {
            System.out.printf("Rainy");
        }
        else if(n>=11 && n<=12)
        {
            System.out.printf("Winter");
        }
        else if(n>=2 && n<=3)
        {
            System.out.printf("Spring");
        }
        else
        {
            System.out.printf("-1");
        }
    }
}