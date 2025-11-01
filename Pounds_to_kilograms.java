
package pounds_to_kilograms;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Pounds_to_kilograms {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Enter the pound amount");
        double pound=input.nextDouble();
        
        double kilograms=pound*0.454;
        JOptionPane.showMessageDialog(null,pound+"pound"+"is"+kilograms+"kilograms");
         
            
                
        
        

    
        
        
        
    }
    
}
