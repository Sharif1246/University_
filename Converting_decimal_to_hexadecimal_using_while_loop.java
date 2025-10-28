
package converting_decimal_to_hexadecimal_using_while_loop;
import java.util.Scanner;
public class Converting_decimal_to_hexadecimal_using_while_loop {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("please enter a decimal number");
        int decimal=input.nextInt();
        
        String hexa="";  // this data type saves the hexa decimals we found and aslo it is empty cause we haven't found anything yet
        
        while(decimal!=0){
           int hexa_decimal_value= decimal%16;
            char hexa_digit;
            
            if(hexa_decimal_value<=9)
               hexa_digit=(char)(hexa_decimal_value+'0');
            else 
                hexa_digit=(char)(hexa_decimal_value-10+'A');

                   hexa = hexa_digit + hexa;
                   
            decimal = decimal/16;
    }
        System.out.println("The hexa decimal number is "+hexa);
    

 
    }
    
}
