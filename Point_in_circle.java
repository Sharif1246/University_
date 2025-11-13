
package point_in_circle;
import java.util.Scanner;
public class Point_in_circle {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a point with two coordinate first iput the x of coordinate then the y of the coordinate"); 
        int x=input.nextInt();
        int y=input.nextInt();
        
        double Distance=Math.sqrt(x*x+y*y);
        if(Distance>10)
            System.out.println("The point is outside the circle");
        else if(Distance<10)
            System.out.println("The point is inside the circle");
        else if(Distance==10)
            System.out.println("The point is on the circle i mean on the curve of circle");
        else
            System.out.println("Invalid input");
    }
    
}
