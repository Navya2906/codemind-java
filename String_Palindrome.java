import java.util.*;
public class StringPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean isPalindrome=true;
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                isPalindrome=false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome==true)
        System.out.print("Palindrome");
        else
        System.out.print("Not Palindrome");
    }
}
