
package two_rectangles3.pkg28;

import java.util.Scanner;

public class Two_rectangles328 {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Enter r1's x, y coordinats, width and height");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double w1=input.nextDouble();
        double h1=input.nextDouble();
        
         System.out.println("Enter r2's x, y coordinats, width and height");
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double w2=input.nextDouble();
        double h2=input.nextDouble();
        
        double r1left=x1-w1/2;
        double r1right=x1+w1/2;
        double r1top=y1+h1/2;
        double r1down=y2-h1/2;
        
        double r2left=x2-w2/2;
        double r2right=x2+w2/2;
        double r2top=y2+h2/2;
        double r2down=y2-h2/2;
        
        if (r2left>=r1left && r2right<=r1right && r2down>=r1down && r2top <=r1top){
            System.out.println("r2 is inside the r1");}
        else if(r2right>=r1left && r2left<=r1right && r2top>=r1down && r2down<=r1top) {   
            System.out.println("r2 overlaps r1");}
        else {
            System.out.println("r2 does not overlap r1");    }
        
    }
    
}
