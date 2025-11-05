
package cost_to_drive;
import java.util.Scanner;
public class Cost_to_drive {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the distance of driving:");
        double distance=input.nextDouble();
        System.out.println("Enter the miles per gallon:");
        double milespergallon=input.nextDouble();
        System.out.println("Enter the price per gallon ");
        double pricepergallon=input.nextDouble();
        
        double X=distance/milespergallon;
        double cost_to_drive=pricepergallon*X;
        
        System.out.printf("The drive costs:%.2f",cost_to_drive);
       
       
        
        
    }
    
}
