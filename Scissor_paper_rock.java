
package scissor_paper_rock;
import java.util.Scanner;
import java.util.Random;
public class Scissor_paper_rock {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     Random rand=new Random();
     
        System.out.println("Scissor(0), rock(1), paper(2):");
        int userguess=input.nextInt();
        
        int random=rand.nextInt(3);
        
        if(random==0){
            if(userguess==0){System.out.println("The computer and you are both Scissor it is draw");}
            else if(userguess==1){System.out.println("The computer is Scissor and you are rock you won and ");} 
            else if(userguess==2){System.out.println("You lost the computer is Scissor");}
            else {System.out.println("invalid");}
             }      
        else if(random==1){
            if (userguess==0)
                System.out.println("The computer is rock and you are Scissor you lost");
            else if (userguess==1)
                System.out.println("The computer is rock and you are also rock it is draw");
            else if (userguess==2)
                System.out.println("The computer rock and you are paper you won");
        }
        else if(random==2){
            if (userguess==0)
                System.out.println("The computer is Paper and you are Scissor you won ");
            else if(userguess==1)
                System.out.println("The computer is paper and you are rock the computer won");
            else if(userguess==2)
                System.out.println("The computer is paper and you are also paper it is draw");
            }
        else{
            System.out.println("Invalid input");} 
           
           
                


}
}