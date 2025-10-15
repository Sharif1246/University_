
package repeat_addition_until_correct;
import java.util.Scanner;
public class Repeat_addition_until_correct {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

     int number1=(int)(Math.random()*10);    // cause we need a one digit 
     int number2=(int)(Math.random()*10);
     
        System.out.println("What is " + number1 + " + " + number2 + "? ");
        int answer=input.nextInt();
        while(answer!= number1+number2){
            System.out.println("wrong answer plaease try again");
        answer=input.nextInt();
    }
        System.out.println("Great job!");  
        input.close();
        
 }
    
}
