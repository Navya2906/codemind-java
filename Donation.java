import java.util.Scanner;
public class Donation
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z=y-x;
        System.out.println(z);
    }
}
