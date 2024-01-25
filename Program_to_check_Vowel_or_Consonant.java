import java.util.*;
public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'A':
                System.out.print("Vowel");
                break;
            case 'e':
                System.out.print("Vowel");
                break;
            case 'i':
                System.out.print("Vowel");
                break;
            case 'O':
                System.out.print("Vowel");
                break;
            case 'U':
                System.out.print("Vowel");
                break;  
            default:
                System.out.print("Consonant");
        }
    }
}