
package sort_three_integers_nonincreasing;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sort_three_integers_nonincreasing {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter the first integer:");
        int integer1=input.nextInt();
        
        System.out.println("Enter the second integer:");
        int integer2=input.nextInt();
        
        System.out.println("Enter the third integer:");
        int integer3=input.nextInt();
        
        if(integer1>integer2 && integer1>integer3 && integer2>integer3){
            System.out.println("The order of integers in decreasing way"+integer1+","+integer2+","+integer3);}
        else if(integer2>integer1 && integer2>integer3 && integer1>integer3){
        System.out.println("The order of integers in decreasing way"+integer2+","+integer1+","+integer3); }
        else if(integer3>integer1 && integer3>integer2 && integer1>integer2){
        System.out.println("The order of integers in decreasing way"+integer3+","+integer1+","+integer2);}
        else if(integer1>integer2 && integer1>integer3 && integer3>integer2){
       System.out.println("The order of integers in decreasing way"+integer1+","+integer3+","+integer2);}
        else if(integer2>integer3 && integer2>integer1 && integer3>integer1){
         System.out.println("The order of integers in decreasing way"+integer2+","+integer3+","+integer1); }  
        else if(integer3>integer1 && integer3>integer2 && integer2>integer1){
            System.out.println("The order of integers in decreasing way"+integer3+","+integer2+","+integer1);}
        else{JOptionPane.showMessageDialog(null, "invallid input");}
        
        
    }
    
}
