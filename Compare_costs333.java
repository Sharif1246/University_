
package compare_costs3.pkg33;

import java.util.Scanner;

public class Compare_costs333 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the Weight and price of package1");
        double w1=input.nextDouble();
        double p1=input.nextDouble();
        
        System.out.print("Enter the Weight and price of package2");
        double w2=input.nextDouble();
        double p2=input.nextDouble();
        
        double cost1=p1/w1;
        double cost2=p2/w2;
        
        if(cost1>cost2)
            System.out.println("Package two has better price.");
        else if(cost1<cost2)
            System.out.println("package one has better price");
        else 
            System.out.println("Both has same price");
        
        
    }
    
}
