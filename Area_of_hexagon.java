
package area_of_hexagon;
import java.util.Scanner;
public class Area_of_hexagon {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the side of hexagon");
        double side=input.nextDouble();
        
        double area=((3*Math.sqrt(3))/2)*side*side;
        System.out.println("The area of hexagon is:"+area);
        
        
        
        
    }
    
}
