
package heads_or_tails;

import java.util.Scanner;
import java.util.Random;
public class Heads_or_tails {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       Random rand=new Random();
        System.out.println("if you thing it is head write 0 and if you thing it is tail write 1");
        int guess=input.nextInt();
        int random=rand.nextInt(2);// cause we just have 0 and 1
        
        if(guess==random)
            System.out.println("Your guess was right ");
        else 
            System.out.println("Your guess was wrong");
        
        
       
    }
    
}
