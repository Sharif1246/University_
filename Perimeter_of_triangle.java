
package perimeter_of_triangle;

import java.util.Scanner;
public class Perimeter_of_triangle {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the rectangle length:");// length is طول  here we name it a
        int a=input.nextInt();
        
        System.out.println("Enter the width of rectangle:");// width is عرض and here we call it b
        int b=input.nextInt();
        
        int rectangle_perimeter=2*(a+b);
        System.out.println("The rectangle perimeter is:"+rectangle_perimeter);
        
        
        
    }
    
}
