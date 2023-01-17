import java.util.*;
class Triangle
{
    Scanner sc=new Scanner(System.in);
    float ar;
    int menu()
    {
        System.out.println("Enter your choice:\n1. Scalene triangle;\n2. Isosceles triangle;\n3. Equilateral triangle; \n4. Exit");
        int ch=sc.nextInt();
        return ch;
    }
    void display()
    {
        float a=0.00f;
        float b=0.00f;
        float c=0.00f;
        switch(menu())
        { 
            case 1:
            {
             float s=0.00f;
             float t=0.00f;
             System.out.println("\nEnter the 3 sides of the scalene triangle :");
             a=sc.nextInt();
             b=sc.nextInt(); 
             c=sc.nextInt();
             s=(a+b+c)/2;
             t=s*(s-a)*(s-b)*(s-c);
             ar=(float)(Math.sqrt(t));
             System.out.println("\nArea of the scalene triangle:"+ar);
             break;
            }          
            case 2:
            {
            System.out.println("\nEnter the measure of the equal sides of the triangle :");
             a=sc.nextInt();
             System.out.println("\nEnter the measure of the unequal side of the triangle :");
             b=sc.nextInt(); 
            ar=(float)((b/4.00f)*(Math.sqrt(4.00f*a*a-b*b)));
            System.out.println("\nArea of the isosceles triangle:"+ar);
            break;
            }
            case 3:
            {
            System.out.println("\nEnter the measure of the equal sides of the triangle :");
            a=sc.nextInt(); 
            ar=(float)(((Math.sqrt(3))/4)*(a*a));
            System.out.println("\nArea of the eqilateral triangle :"+ar);
            break;
            }
            case 4:
            {
            System.exit(0);
            }
            default:
            {
            System.out.println("\nOops! Invalid menu choice");
            break;
            }
        }
    }
    public static void main(String args[])
    {
        Triangle xx=new Triangle();        
        xx.display(); 
    }
}
