import java.util.*;
public class Question_3
{
    private int n;
    public Question_3()
    {
        n=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        do{
        n=sc.nextInt();
        }while((countDigits(n))%2==0);
    }
    public int countDigits(int x)
    {
        int c=0;
        int m=x;
        while(m>0)
        {
            c++;
            m=m/10;
        } 
        return c;
    }
    public int change()
    {
        int l=n%10;
        int m=n;
        int a=0;
        int c=countDigits(n);
        while(m>0)
        {
            a=m%10;
            m=m/10;
        }
        int b=n/10;
        int r=(int)(b%(Math.pow(10,(c-2))));
        int num=(int)(((l*(Math.pow(10,(c-2))))+r)*10)+a;
        return num;
    }
    public void display()
    {
        System.out.println("New Number Formed= "+change());
    }
}
class InitQuestion_3
{
    public static void main(String args[])
    {
        Question_3 obj=new Question_3();
        obj.accept();
        obj.display();
    }
}