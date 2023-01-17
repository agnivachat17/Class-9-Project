import java.util.*;
public class Question_4
{
   public static void main()
   {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the number of rows:");
       int n=sc.nextInt();
       System.out.println("Here is the required pattern!!!\n");
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
       for(int a=n-1;a>=1;a--)
       {
           for(int b=1;b<=a;b++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}