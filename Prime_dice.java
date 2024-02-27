import java.util.*;
public class PrimeDice
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
          int a=sc.nextInt();
          int b=sc.nextInt();
          if((a+b)==2 || (a+b)==3 || (a+b)==5 ||(a+b)==7 ||(a+b)==11 )
          {
            System.out.println("tevitt");
          }
          else
          {
            System.out.println("Satya");
           }
         }
      }
   }