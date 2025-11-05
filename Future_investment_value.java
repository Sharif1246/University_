
package future_investment_value;
import java.util.Scanner;
public class Future_investment_value {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter the investment amount:");
        double invest_amount=input.nextDouble();
        System.out.println("Enter the anual interest rate in percentage:");
        double rate=input.nextDouble();
        System.out.println("Enter the number of years:");
        int year=input.nextInt();
        
        double monthly_interest_rate=rate/1200;
        
        
        double future_value=invest_amount*Math.pow((1+monthly_interest_rate),12*year);
        
        System.out.println("The future investment is:"+future_value);
        
        
    }
    
}
