
package area_of_triangle_using_points;
import java.util.Scanner;
public class Area_of_triangle_using_points {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Enter the X1 and Y1:");
        double X1=input.nextDouble();
        double Y1=input.nextDouble();
        
        System.out.println("Enter the X2 and Y2:");
        double X2=input.nextDouble();
        double Y2=input.nextDouble();
        
        System.out.println("Enter the X3 and Y3:");
        double X3=input.nextDouble();
        double Y3=input.nextDouble();
        
        double side1=Math.sqrt((X1-X2)*(X1-X2)+(Y1-Y2)*(Y1-Y2));
        double side2=Math.sqrt((X1-X3)*(X1-X3)+(Y1-Y3)*(Y1-Y3));
        double side3=Math.sqrt((X3-X2)*(X3-X2)+(Y3-Y2)*(Y3-Y2));
        
        double s=(side1+side2+side3)/2; // s here is the rectangles half perimeter
        double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
        System.out.printf("The area of rectangle is%.2f"+area);
        
        
      
      

    }
    
}
