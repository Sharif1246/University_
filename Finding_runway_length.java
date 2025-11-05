
package finding_runway_length;
import java.util.Scanner;
public class Finding_runway_length {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      
        System.out.println("Enter the speed:");
        double speed=input.nextDouble();
        System.out.println("Enter the acceleration:");
        double a=input.nextDouble();
        
        double L=(speed*speed)/(2*a);
        System.out.println("The minimum runway length:"+L);
        
    }
    
}
