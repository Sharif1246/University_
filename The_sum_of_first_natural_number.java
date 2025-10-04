
package the_sum_of_first_natural_number;
import java.util.Scanner;
public class The_sum_of_first_natural_number {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of first natural number:");
        int n=input.nextInt();
        
        int S=n*(n+1)/2;//S is the gotten from sum!
        System.out.println("The sum of first"+n+"number is:"+S);
        
    }
    
}
