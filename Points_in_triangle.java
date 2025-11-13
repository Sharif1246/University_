
package points_in_triangle;

import java.util.Scanner;

public class Points_in_triangle {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter the X and Y coordinates:");
        double X=input.nextDouble();
        double Y=input.nextDouble();
        
        boolean inside=(X<=200)&&(Y<=100)&&(Y<=-0.5*X+100)&&(X>=0)&&(Y>=0);
        
        if(inside)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in Tringle");
    }
    
}
