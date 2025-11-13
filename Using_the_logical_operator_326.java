
package using_the_logical_operator_3.pkg26;

import java.util.Scanner;

public class Using_the_logical_operator_326 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer:");
       int integer=input.nextInt();
       
       boolean divisableby5=(integer%5==0);
       boolean divisableby6=(integer%6==0);
       
        System.out.println("Is "+integer+"divisable by 5 and 6"+(divisableby5 && divisableby6));
        System.out.println("Is"+integer+"divisable by 5 or 6"+(divisableby5 || divisableby6)); 
        System.out.println("Is"+integer+"divisable by 5 or 6, but not both?"+(divisableby5 ^ divisableby6));
    }
    
}
