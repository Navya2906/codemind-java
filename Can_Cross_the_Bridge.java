import java.util.*;
public class Bridge
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int r=(z-y)/x;
        System.out.println(r);
    }
}