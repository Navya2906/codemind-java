import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        int sum=0,temp,r;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        temp=a;
        while(a>0)
        {
           r=a%10;
           sum=(sum*10)+r;
           a=a/10;
        }
        if(temp==sum)
        {
           System.out.print("True");
         }
         else
         {
             System.out.print("False");
        }
    }
}