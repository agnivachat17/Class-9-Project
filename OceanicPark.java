import java.util.*;
class OceanicPark
{
    int norids, nopersons;
    Scanner sc=new Scanner(System.in);
    void takeDetails()
    {
        System.out.println("Enter number of rides booked:");
        norids=sc.nextInt();
        System.out.println("\nEnter number of persons :");
        nopersons=sc.nextInt();
    }
    float getFull()
    {
        if(norids<=5)
         return (norids*30*69);
        else if (norids<=10)
         return ((5*30)+(norids-5)*25)*69;
        else if (norids<=20)
         return ((5*30)+(5*25)+(norids-10)*20)*69;
         else
         return ((5*30)+(5*25)+(10*20)+(norids-20)*18)*69;
    }
    void showDetails()
    {
        System.out.println("\nNumber of rides booked:"+norids);
        System.out.println("\nNumber of persons :"+nopersons);
        float amt=(getFull());
        System.out.println("\nAmount paid by one person :"+amt);
        float tot=amt*nopersons;
        System.out.println("\nTotal amount paid by all persons:"+tot);
    }
    public static void main(String args[])
    {
      OceanicPark xx=new OceanicPark();
      xx.takeDetails(); 
      xx.showDetails();  
    }
}
