
package palindrome_number;

import java.util.Scanner;

public class Palindrome_number {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      
        System.out.println("Enter a three digit integer");
        int number=input.nextInt();
        
        double digit1=(int)(number%10);
        double digit2=(int)((number/10)%10);
        double digit3=(int)(number/100);
        
        if(digit1==digit3)
            System.out.println("The number that you enterd is palindrome");
        else
            System.out.println("The number you entered is not palindrome");
    }
    
}
