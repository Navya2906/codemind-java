import java.util.*;
public class Circle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double Area=r*r*3.14;
        System.out.printf("%.2f",Area);
    }
}