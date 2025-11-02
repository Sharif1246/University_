
package sum_of_the_integer_digits;

import java.util.Scanner;

public class Sum_of_the_integer_digits {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("enter a number between 0 to 1000");
        int number=input.nextInt();
        
        int first_integer_of_number=(int)(number/100);
        int second_digit=(int)(number%100);
        int third_digit=(int)(number%10);
        int s =(int)second_digit /10;
        
        
        double sum_of_digits=s+first_integer_of_number+third_digit;
        System.out.printf("Sum of digits in integer"+number+"is\t"+sum_of_digits);
        
        
        
       
    }
    
}
