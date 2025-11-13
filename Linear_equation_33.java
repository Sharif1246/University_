
package linear_equation_3.pkg3;

import java.util.Scanner;

public class Linear_equation_33 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the a,b,c,d,e,f: ");
        double a =input.nextDouble();
        double b =input.nextDouble();
        double c =input.nextDouble();
        double d =input.nextDouble();
        double e =input.nextDouble();
        double f =input.nextDouble();
        
        double denominator=a*d-b*c;
        if(denominator==0){
            System.out.println("The equation has no solution");}
        else{
            double x=(e*d-b*f)/denominator;
            double y=(a*f-e*c)/denominator;
            System.out.println("x is: "+x+"and y is: "+y);
        
            }
    }
    
}
