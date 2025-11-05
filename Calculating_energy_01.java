
package calculating_energy_01;
import java.util.Scanner;
public class Calculating_energy_01 {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     
        System.out.println("Enter the amount of water in kilograms");
        double M=input.nextDouble();
        System.out.println("Enter the initial temprature");
        double initial_temperature=input.nextDouble();
        System.out.println("Enter the final tempreture");
        double final_tempereture=input.nextDouble();
        
        double energy=M*(final_tempereture-initial_temperature)*4184;
        
        System.out.println("The amount of energy needed is; "+energy);
        
        
        
       
        
    }
    
}
