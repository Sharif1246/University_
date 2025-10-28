
package prime_number;
public class Prime_number {

    public static void main(String[] args) {
        int count=0; 
        int number=2;
        
        while(count<50){
           int i; 
            for(i=2; i < number; i++ ){
                if(number%i==0){
                    break;
                }
            }
            
            if(i==number){
                System.out.printf("%4d",number);
            count++;
            
                if(count%10==0){
                    System.out.println();
                
            } 
        }

        number++;

        
        }

    }
    
}
