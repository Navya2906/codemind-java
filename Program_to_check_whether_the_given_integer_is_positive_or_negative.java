import java.util.*;
public class PositiveOrNegative
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.printf("Positive Number");
        }
        else 
        {
            System.out.printf("Negative Number");
        }
    }
}