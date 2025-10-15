
package guess_number;
import java.util.Scanner;
import java.util.Random;
public class Guess_Number {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       Random rand= new Random();
       
       int random_number= rand.nextInt(101);
       int user_guess= -6;
       
        System.out.println("We have find a random number");
        System.out.println("Now try to guess the Number");
        
        while( user_guess!=random_number ){
            System.out.println("Enter a number now");
            user_guess= input.nextInt();
            
            if(random_number<user_guess){
                System.out.println("The number that you enter is bigger than random number, try again");
            }
            else if(random_number>user_guess)
                {System.out.println("The number that you entered is smaller than random number");} 
            
            else
                {System.out.println("CONGRATS, YOUR GUESS IS MATCHED WITH RANDOM NUMBER ");}

        }
 
    }
    
}
