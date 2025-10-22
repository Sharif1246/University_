
package guessing_number_with_forloop;
import java.util.Scanner;
public class Guessing_Number_with_Forloop {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        
        
    int correct_count=0;
    
    
    for(int i=1;i<=7;i++ ){
        
        int number1= (int)(Math.random()*10);
        int number2= (int)(Math.random()*10);
        
        
        if(number1<number2){// in here we swap two numbers cause we want the number1-number2 so the answer will be positive no negative number 
        int temp=number1;
         number1=number2;
         number2=temp;
        }
        
        System.out.println("Question"+i+":what is"+number1+"-"+number2);
        int answer=input.nextInt();
        
        if(number1-number2==answer){
            System.out.println("correct");
            correct_count++;
        }else{System.out.println("your answer is wrong the correct answer is"+(number1-number2)+".\n");}
    }
        System.out.println("you got"+correct_count+"out of 7");

    }
    
}
