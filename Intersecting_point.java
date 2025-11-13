
package intersecting_point;

import java.util.Scanner;

public class Intersecting_point {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     
        System.out.println("Enter the x1,y1,x2,y2,x3,y3,x4,y4");
        int x1=input.nextInt();
        int y1=input.nextInt();
        int x2=input.nextInt();
        int y2=input.nextInt();
        int x3=input.nextInt();
        int y3=input.nextInt();
        int x4=input.nextInt();
        int y4=input.nextInt();
    
        double a1=y1-y2;
        double b1= -(x1-x2);
        double c1= a1*x1+b1*y1;
        
        double a2=y3-y4;
        double b2= -(x3-x4);
        double c2= a2*x3+b2*y3;
        
        double denominator=a1*b2-b1*a2;
        
        if(denominator==0){
            System.out.println("The two lines are parellel");}
        else {
            double x=(c1*b2-b1*c2)/denominator;
            double y=(a1*c2-c1*a2)/denominator;
            System.out.println("The intersecting point is at: ( "+x+","+y+")");
        }
        
        
 }
}