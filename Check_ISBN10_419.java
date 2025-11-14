
package check_isbn10_4.pkg19;

import java.util.Scanner;

public class Check_ISBN10_419 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter the first nine digits of an ISBN as a string: ");
        String isbn=input.next();
        
        if(isbn.length()!=9){
            System.out.println("ISBN must be 9 numbers");
            return;
        }
         int d1=isbn.charAt(0)-'0';// convert each character to a digit
         int d2=isbn.charAt(1)-'0';
         int d3=isbn.charAt(2)-'0';
         int d4=isbn.charAt(3)-'0';
         int d5=isbn.charAt(4)-'0';
         int d6=isbn.charAt(5)-'0';
         int d7=isbn.charAt(6)-'0';
         int d8=isbn.charAt(7)-'0';
         int d9=isbn.charAt(8)-'0';
         
        int checksum= (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
        
        String fullisbn=isbn+(checksum==10 ? "X" : checksum);
        System.out.println("The full isbn is: "+fullisbn);

    }
    
}
