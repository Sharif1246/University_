
package calculate_tips;

import java.util.Scanner;

public class Calculate_tips {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the subtotal:");
        double subtotal=input.nextDouble();
        System.out.println("Enter the gratuity rate:");
        double gratuity_rate=input.nextDouble();
        
        double total=subtotal*(gratuity_rate/100)+subtotal;
        System.out.println("the total after gratuity rate is"+total);
        
        
    }
    
}
