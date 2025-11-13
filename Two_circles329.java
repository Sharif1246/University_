
package two_circles3.pkg29;

import java.util.Scanner;

public class Two_circles329 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the circle1 center x and y also enter the its radius");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double r1=input.nextDouble();
        
         System.out.println("Enter the circle2 center x and y also enter the its radius");
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double r2=input.nextDouble();
        
        double distance=Math.sqrt(Math.pow(x2-x1, r2)+Math.pow(y2-y1,2));
        
        if(distance<=r1-r2)
            System.out.println("Circle2 is inside the circle1");
        else if(distance<=r1+r2)
            System.out.println("Circle2 overlap circle1");
        else
            System.out.println("circle2 doesnot overlap cicle1");
        
        
       
        
    }
    
}
