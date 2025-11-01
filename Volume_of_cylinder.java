
package volume_of_cylinder;
import java.util.Scanner;
public class Volume_of_cylinder {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("please enter the radius of cylinder");
        double radius=input.nextDouble();
        
        System.out.println("Enter the length of the cylinder");
        double length=input.nextDouble();
        
        double area= radius*radius*Math.PI;
        double volume=area*length;
        
        System.out.println("The volume of the cylinder is"+volume);
        System.out.println("The area of the cylinder is"+area);

    }
    
}
