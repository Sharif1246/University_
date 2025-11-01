
package feet_to_meters;
import java.util.Scanner;
public class Feet_to_meters {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("please enter the value of feet");
        double feet=input.nextDouble();
        
        double meters=feet*0.305;
        System.out.println(feet+"is equals to"+meters);

    }
    
}
