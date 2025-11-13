
package point_position3.pkg32;

import java.util.Scanner;

public class Point_position332 {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     
        System.out.println("Enter the three points for p0,p1 and p2: ");
        double x0=input.nextDouble();
        double y0=input.nextDouble();
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
     
        double position=(x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        
        if(position >0)
            System.out.println("P2 is on the left side of line");
        else if(position<0)
            System.out.println("P2 is on the right side of the line");
        else
            System.out.println("P2 is on the same line");
    }
    
}
