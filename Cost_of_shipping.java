
package cost_of_shipping;
import java.util.Scanner;
public class Cost_of_shipping {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      
        System.out.println("Enter the weight in pound");
        double weight=input.nextDouble();
        
        if(weight>0 && weight<=20){
           if(weight>0 && weight<=1) 
                System.out.println("The cost of shipping is 3.5 dollars");
           else if(weight>1 && weight<=3)
                System.out.println("The cost of shipping is 5.5 dollars");
           else if(weight>3 && weight<=10)
                System.out.println("The cost of shipping is 8.5 dollars ");
           else if(weight>10 && weight<=20)
                System.out.println("The cost of shipping is 10.5");
        }
        else if(weight>20) {
            System.out.println("The pacakge cannot be shipped");}
        else{
            System.out.println("invalid input");}

            
    }
    
}
