import java.util.*;
public class BinaryToOctal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String num=sc.nextLine();
            int decimal=Integer.parseInt(num,2);
            String octal=Integer.toOctalString(decimal);
            System.out.println(octal);
        }
    }
}