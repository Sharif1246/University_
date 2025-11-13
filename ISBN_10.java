
package isbn_10;
import java.util.Scanner;
public class ISBN_10 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first nine digits of an ISBN as integer:");
        int integer=input.nextInt();
        
        int d1=(int)(integer/100000000);
        
        int d2=(int)((integer/10000000)%10);
 
        int d3=(int)((integer/1000000)%10);
        
        int d4=(int)((integer/100000)%10);
       
        int d5=(int)((integer/10000)%10);
       
        int d6=(int)((integer/1000)%10);
       
        int d7=(int)((integer/100)%10);
       
        int d8=(int)((integer/10)%10);
        
        int d9=integer%10;
        int d10= (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
 d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11;
        if (d10==10){
            System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+"x");
        }else {
            System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+d10);
        }
        
        
    }
    
}
