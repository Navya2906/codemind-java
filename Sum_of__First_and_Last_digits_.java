import java.util.*;
public class FirstAndLast
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        int first=0;
        while(n>0)
        {
            if((n/10)==0)
            {
                first=n%10;
            }
            n=n/10;
        }
        System.out.println(first+last);
    }
}
