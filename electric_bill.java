import java.util.Scanner;
public class electric_bill {
    public static void main(String args[])
    {
        double b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of the consumer:");
        String n =sc.nextLine();
        System.out.println("Enter the unit consumed by the consumer:");
        double unit =sc.nextDouble();
        if(unit<100)
        b=2.5*unit;
        else if (unit <= 300) {
            b=2.5*100+4.0*(unit-100);
        }
        else if (unit<=300) {
            b=2.5*100+4.0*(unit-100);            
        }
        else if (unit<=500) {
            b=2.5*100+4.0*200+6.5*(unit-300);
        }
        else
        b=2.5*100+4.0*200+6.5*200+75*(unit-500);
    
        System.out.println("consumer name:"+n);
        System.out.println("units consumed:"+unit);
        System.out.println("Total bill="+b);
    }
}