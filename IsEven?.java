import java.util.*;
public class Even
{
    static void displayName()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        System.out.println(2);
        else
        System.out.println(1);
    }
    public static void main(String[] args)
    {
        displayName();
    }
}