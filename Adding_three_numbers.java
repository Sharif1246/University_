
package adding_three_numbers;
import java.util.Scanner;
public class Adding_three_numbers {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);
        int number3=(int)(Math.random()*10);
        
        int answer=number1+number2+number3;
        
        System.out.println("What is:"+number1+"+"+number2+"+"+number3+"="+"?");
        int user_answer=input.nextInt();
        
        if(answer==user_answer)
            System.out.println("Congrats, your answer is right");
        else 
            System.out.println("Wrong!");
        
        
        
        
       
        
        
        
    }
    
}
