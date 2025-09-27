
package chaning_celcius_to_fahrenhiet;

import java.util.Scanner;
public class Chaning_celcius_to_fahrenhiet {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the celcius scale:");
        double C= input.nextDouble();  // We are asking the scale of celcius from the user!
        double F=(9.0/5.0)*C+32;// F is the fahreinhiet!
        System.out.println("The fahrenhiet equals to:"+F);
    }
    
}
