
package currency_exchange3.pkg31;

import java.util.Scanner;

public class Currency_exchange331 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double rate=input.nextDouble();
        
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice=input.nextInt();
        
        if(choice==0){
            System.out.println("Enter the dollar amount");
            double dollars=input.nextDouble();
            double rmb=dollars*rate;
            System.out.printf("$%.2f is %.2fyuan%n",dollars,rmb);}
        else if(choice==1){
            System.out.println("Enter the RMB amount: ");
            double rmb=input.nextDouble();
            double dollars=rmb/rate;
            System.out.printf("%.2f yuan is $%.2f",rmb,dollars);
        }
        else{
            System.out.println("Invalid choice");
        }
        
        
        
        
    }
    
}
