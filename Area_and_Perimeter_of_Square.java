import java.util.Scanner;
public class Square
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int Area=a*a;
        System.out.printf("%d ",Area);
        int perimeter=a*4;
        System.out.printf("%d",perimeter);
    }
}