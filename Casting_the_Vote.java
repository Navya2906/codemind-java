import java.util.Scanner;
public class CastingTheVote
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        if (X>=18) 
        {
            System.out.println("YES");
        } 
        else 
        {
            System.out.println("NO");
        }
    }
}