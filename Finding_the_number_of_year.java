
package finding_the_number_of_year;
import java.util.Scanner;
public class Finding_the_number_of_year {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      
        System.out.println("Enter the minutes");
        int minutes= input.nextInt();
       
        int days=minutes/1440;
        int year=days/365;
        int day=days%365;
        
        System.out.println(minutes+"is equal to "+year+" year"+" and"+day+" days");
        
        
      
      
        
    }
    
}
