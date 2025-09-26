
package the_area_of_circle;

import java.util.Scanner;
public class The_area_of_circle {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius=input.nextDouble();
        
         double area= radius*radius*3.1415;
        System.out.println("The area of circle is:" +area);
      
    }
    
}
