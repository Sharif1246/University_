
package point_in_rectangle_asking_from_user;

import java.util.Scanner;

public class Point_in_rectangle_asking_from_user {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a point with 2 coordinate");
        
        double x=input.nextDouble();
        double y=input.nextDouble();
        
        int width=10;
        int height=5;
        
        boolean inside=(Math.abs(x)<= (width/2)) && (Math.abs(y)<=(height/2));
        
        if(inside)
            System.out.println("point("+x+","+y+")"+"is inside the rectangle");
        else
            System.out.println("point("+x+","+y+")"+"is not inside the rectangle");
        
        
    }
    
}
