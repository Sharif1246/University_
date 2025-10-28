
package guessin_numbers_using_brak_statment;
import java.util.Scanner;
public class Guessin_numbers_using_brak_statment {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int random_number=(int)(Math.random()*10);
      
      while(true){
          System.out.println("Guess the number");
          int guess=input.nextInt();
          
          if(guess>random_number)
            {System.out.println("the number that you entered is bigger than random_number");}
          else if(guess<random_number){
              System.out.println("the number that you enterd is smaller than the random number");}
          else{
              System.out.println("the number you enterd is exactly the random number");
          break;

          }
         }
    }
    
}
