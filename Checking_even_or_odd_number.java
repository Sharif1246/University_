
package checking_even_or_odd_number;
import java.util.Scanner;
public class Checking_even_or_odd_number {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Please enter the number to check wheather it is even or odd:");
        int number=input.nextInt();
        
        if(number%2==0){System.out.println("The number that you enterd is even.");}
        else{System.out.println("The number that you entered is odd");}
        
        
    }
    
}
