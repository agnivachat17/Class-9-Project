import java.util.*;
public class Question_5
{
   public static void main()
   {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the number of rows:");
       int n=sc.nextInt();
       System.out.println("Here is the required pattern!!!\n");
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=n-i;j++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=(2*i)-1;k++)
           {
               if((k==1)||(k==((2*i)-1)))
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
       for(int a=n-1;a>=1;a--)
       {
           for(int b=1;b<=n-a;b++)
           {
               System.out.print(" ");
           }
           for(int c=1;c<=(2*a)-1;c++)
           {
               if((c==1)||(c==((2*a)-1)))
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}