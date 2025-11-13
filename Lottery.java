
package lottery;

import java.util.Random;
import java.util.Scanner;
public class Lottery {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       Random rand=new Random();
       
        System.out.println("Enter the three digit integer");
        int number=input.nextInt();
        
        int digit1=number/100;
        int digit2=(int)((number/10)%10);
        int digit3=number%10;
        
        int lottery_number=rand.nextInt(1000);
        
        int L1=number/100;
        int L2=(int)((number/10)%10);
        int L3=number%10;
        
        if(number==lottery_number){
            System.out.println("Congrats you won 10000$");}
        else if((digit1==L1 && digit2==L3&& digit3==L2)||
          (digit1==L3 && digit2==L1 && digit3==L2) || 
          (digit1==L3 && digit2==L2 && digit3==L1)  ||
          (digit1==L2 && digit2==L3 && digit3==L1) ||
          (digit1==L2 && digit2==L1 && digit3==L3)){
        System.out.println("Congrats you won 3000$ cause the number were write but not the order!");}
        else if((digit1==L1 ||digit1==L2 || digit1==L3) || (digit2==L1 ||digit2==L2 || digit2==L3)|| (digit3==L1 ||digit3==L2 || digit3==L3))
        {
            System.out.println("Cograts you won 1000$ cause at least one of your digits be on lottery");}
 
    }
    
}
