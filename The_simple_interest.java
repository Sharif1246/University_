
package the_simple_interest;

import java.util.Scanner;
public class The_simple_interest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Please enter the principal");// principlal in here in here is the original amount of money and we show it with p
        int P=input.nextInt();
        
        System.out.println("Enter the rate amount%:");
        double R=input.nextDouble();
        
        System.out.println("Enter the time passed from original money in year");
        int T=input.nextInt();
        
        double SI=R*T*P/100;
        System.out.println("The simple interest after"+T+"is"+SI);

    }
    
}
