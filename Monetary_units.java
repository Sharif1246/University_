
package monetary_units;

import java.util.Scanner;

public class Monetary_units {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter an amount, in dollar like 12.46:");
        double amount=input.nextDouble();
        
        int remaining_amount=(int)(amount*100);// in here we changed all to cents
        
        
        int dollar=(int)(remaining_amount/100);
        int recents=(remaining_amount%100);
        
        int quarter=recents/25;
        recents %=25;      // cause inhere after getting the quarter we need the remaining of cents to change to other things like pinny
        
        int dimes=recents/10;
        recents %=10;
        
        int nickles=recents/5;
        recents %=5;
        
        int pennies=recents;
        
        if(dollar>0){
            System.out.println(dollar+(dollar==1?"dollar":"dollars")); }
        if (quarter>0){
            System.out.println(quarter+(quarter==1?"quarter":"quarters"));}
        if (dimes>0){
            System.out.println(dimes+(dimes==1?"dime":"dimes"));}
        if (nickles>0){
            System.out.println(nickles+(nickles==1?"nickle":"nickeles"));}
        if (pennies>0){
            System.out.println(pennies+(pennies==1?"pennie":"pennies"));}

    }
    
}
