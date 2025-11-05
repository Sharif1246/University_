
package calculating_bmi;
import java.util.Scanner;
public class Calculating_BMI {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter your weight in pound");
        double   weight=input.nextDouble();
        
        System.out.println("Enter your height in inch");
        double heigth=input.nextDouble();
        
        double weight_to_kilogram=weight*0.45359237;
        double heigth_to_meter=heigth* 0.0254;
        
        double BMI=weight_to_kilogram/(heigth_to_meter*heigth_to_meter);
        System.out.println("The BMI of you is:"+BMI);
       
    }
    
}
