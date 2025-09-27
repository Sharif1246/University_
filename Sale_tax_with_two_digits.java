
package sale_tax_with_two_digits;
import java.util.Scanner;
public class Sale_tax_with_two_digits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         
         System.out.println("Enter the amount of the good:"); 
         double purchase_amount=input.nextDouble();
         
         System.out.println("Enter the tax rate");
         double taxrate=input.nextDouble();
         
         double tax=purchase_amount*(taxrate/100);
         System.out.printf("The total price after tax is: %.2f%n",tax);
         System.out.println("If you want the total after tax write yes");
         
         String choose=input.next();
         if(choose.equalsIgnoreCase("yes")){
             double total_amount=purchase_amount+tax;
             System.out.printf("The total amount after tax is:%.2f%n",total_amount);
         }
         else {System.out.println("OK the total amount does not appear.");}

    }
    
}
