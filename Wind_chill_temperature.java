
package wind_chill_temperature;
import java.util.Scanner;
public class Wind_chill_temperature {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F:");
        double T=input.nextDouble();
        System.out.println("Enter the wind speed (>= 2) in miles per hour:");
        double V=input.nextDouble();
        
        double Twc=35.74+0.6215*T-35.75*Math.pow(V, 0.16)+0.4275*T*Math.pow(V, 0.16);
        System.out.println("The wind chill is:"+Twc);
    }
    
}
