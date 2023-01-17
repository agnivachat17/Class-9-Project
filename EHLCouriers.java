import java.util.*;
class EHLCouriers
{
    int wt;
    Scanner sc=new Scanner(System.in);
    void acceptWeight()
    {
        System.out.println("Enter the weight of the parcel:");
        wt=sc.nextInt();
    }
    void display()
    {
       int ch=0;
       int ex=0;
        if (wt<=50)
         ch=20;
       else 
       { 
           ex=wt-50;
         ch=20+((ex/30)*15);
         if (ex%30>0)
           ch=ch+15;
       }
        System.out.println("\nPostal Charges:"+ch);
    }
    public static void main(String args[])
    {
        EHLCouriers xx=new EHLCouriers();
        xx.acceptWeight(); xx.display(); 
    }
}
