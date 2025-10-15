
package addition_quiz_with_try_limitation;
import java.util.Scanner;
public class Addition_quiz_with_try_limitation {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);
        
        int answer;
        int number_of_tried_times= 0;
        int max_number_of_tried_times=5;
        
        System.out.println("What is:"+number1+"+"+number2+"?");
        answer=input.nextInt();
       number_of_tried_times++;
       
       while(answer!=number1+number2 && number_of_tried_times<max_number_of_tried_times){
           System.out.println("WRONG answe, Try again");
           answer = input.nextInt();
           number_of_tried_times++;}
       if ( answer==number1+number2 ){
           System.out.println("correct you did it in"+number_of_tried_times+"tries");}
       else{System.out.println("Sorry you reached the maximum tried times"+"("+max_number_of_tried_times+")"+"the answer is:"+(number1+number2));   }
           
input.close();
    }
    
}
