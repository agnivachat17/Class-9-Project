import java.util.*;
class MeritCard
{
    String stdName,regNo;
    int m1,m2,m3; char gd;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter Student's name :");
        stdName=sc.nextLine();
        System.out.println("\nEnter registration number :");
        regNo=sc.nextLine();
        System.out.println("\nEnter marks 0f three different subject:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    void display()
    {
        float avg=(m1+m2+m3)/3;
        gd=(avg>=85)?'A':(avg>=70)?'B':(avg>=50)?'C':(avg>=40)?'D':'F';
        System.out.println("\nSTUDENT'S NAME :"+stdName);
        System.out.println("\nSTUDENT'S REGISTRATION NUMBER :"+regNo);
        System.out.println("\nMARKS OF 1ST SUBJECT :"+m1);
        System.out.println("\nMARKS OF 2ND SUBJECT :"+m2);
        System.out.println("\nMARKS OF 3RD SUBJECT :"+m3);
        System.out.println("\nGRADATION :"+gd);
    }
    public static void main(String args[])
    {
        MeritCard xx=new MeritCard();
        xx.accept(); xx.display(); 
    }
}
