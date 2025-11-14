
package area_of_a_regular_polygon4.pkg5;

import java.util.Scanner;

public class Area_of_a_regular_polygon45 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter the number of sides");
        int n=input.nextInt();
        
        System.out.println("Enter the side");
        double side=input.nextDouble();
        
        double Area=(n*side*side)/(4*Math.tan((Math.PI/n)));
        System.out.println("The area of polygon is: "+Area);
       
    }
    
}
