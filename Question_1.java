import java.util.*;
public class Question_1
{
    private int n;
    public Question_1()
    {
        n=0;
    }
    public void accept()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
    }
    public boolean isPrime(int x)
    {
        if (n <= 1)
        {
           return false;
        }
        int f=0;
        for(int i=1;i<=x/2;i++)
        {
            if(x%i==0)
            {
                f++;
            }
        }
        if(f==1)
        {
           return true;
        }
        else
        {
           return false;
        }
    }
    public void display()
    {
        if((isPrime(n)==true)&&(isPrime(n-2)==true))
        {
            System.out.println(n+" can be expressed as a sum of two prime numbers.");
            System.out.print("Explanation: ");
            System.out.print(n+" can be written as: " + (n-2));
            System.out.print("+2");
        }
        else
        {
            System.out.println(n+" cannot be expressed as a sum of two prime numbers");
        }
    }
}
class InitQuestion_1
{
    public static void main(String args[])
    {
        Question_1 obj=new Question_1();
        obj.accept();
        obj.display();
    }
}