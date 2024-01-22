import java.util.Scanner;
public class InteriorDesign 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x=x1+y1;
        int y=x2+y2;
        int z=Math.min(x,y);
        System.out.println(z);
    }
}
