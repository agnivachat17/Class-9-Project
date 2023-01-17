import java.util.*;
public class Question_2
{
    private int n;
    private int k;
    public Question_2()
    {
        n=0;
        k=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("For a k-almost Prime number, enter the value of k:");
        k=sc.nextInt();
        System.out.println("Enter the number of terms:");
        n=sc.nextInt();
    }
    public int countPrimeFactors(int x)
    {
        int m=x;
        int f=2;
        int s=0;
        int c=0;
        while(m>1)
        {
            if(m%f==0)
            {
                s=s+f;
                m=m/f;
                c++;
            }
            else
            {
                f=f+1;
            }
        }
        return c;
    }
    public void DispKAlmostPrimes()
    {
        for (int i = 1, num = 2; i <= n; num++)
        { 
            if (countPrimeFactors(num) == k) 
            { 
                System.out.println(num + " "); 
                i++; 
            } 
        }
    }
}
class InitQuestion_2
{
    public static void main(String args[])
    {
        Question_2 obj=new Question_2();
        obj.accept();
        obj.DispKAlmostPrimes();
    }
}