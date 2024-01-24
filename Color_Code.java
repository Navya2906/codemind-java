import java.util.*;
public class COlourCode
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'v': 
                System.out.println("Violet");
                break;
            case 'i':
                System.out.println("Indigo");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'Y': 
                System.out.println("Yellow");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'R':
                System.out.println("Red");
                break;
            default:
                System.out.println("-1");
        }
    }
}