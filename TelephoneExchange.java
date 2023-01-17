import java.util.*;
class TelephoneExchange
{
    String cname; 
    int noc; 
    char callType;
    Scanner sc=new Scanner(System.in);
    void acceptCalls()
    {
        System.out.println("Enter customer's name:");
        cname=sc.nextLine();
        System.out.println("\nEnter call type (L for local calls/STD AND I for ISD) :");
        callType=sc.next().charAt(0);
        System.out.println("\nEnter the number of calls :");
        noc=sc.nextInt();
    }
    float getbillamount()
    {
        if (callType=='L')
        {
            if (noc<=50)
             return 0;
            else if (noc<=120)
             return (float)(noc*1.25f);
            else if (noc<=240)
             return (float)(noc*1.75f);
            else
             return (float)(noc*2.25f);
        }
        else
        {  
            if(noc<=50)
             return (float)(20.50f*noc);
            else if (noc<=120)
             return (float)(65.75f*noc);
            else if(noc<=240)
             return (float)(110.50f*noc);
             else
             return (float)(150.50f*noc);
        }
    }
    void display()
    {
        System.out.println("\nCustomer's name :"+cname);
        System.out.println("\nNumber of calls :"+noc);
        System.out.println("\nBill amount :"+(getbillamount()));
    }
    public static void main(String args[])
    {
        TelephoneExchange xx=new TelephoneExchange();
        xx.acceptCalls(); 
        xx.display(); 
    }
}   

