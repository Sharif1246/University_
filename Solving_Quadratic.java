
package solving_quadratic;
import java.util.Scanner;
public class Solving_Quadratic {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter the a: ");
        double a=input.nextDouble();
        System.out.println("Enter the b: ");
        double b=input.nextDouble();
        System.out.println("Enter the c: ");
        double c=input.nextDouble();
        
        double delta=b*b-4*a*c;
        double X1=(-b+Math.sqrt(delta))/2*a*c;
        double X2=(-b-Math.sqrt(delta))/2*a*c;
        
        
        
        if(delta>0){
            System.out.println("The equation has 2 roots: "+X1+","+X2);
        }
        else if(delta==0){
            System.out.println("The equation has one root: "+X1);   
        }
            
        else if(delta<0){
            System.out.println("The equation has no real root!");
        }
            
        
        
    }
    
}
