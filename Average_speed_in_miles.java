
package average_speed_in_miles;
import java.util.Scanner;
public class Average_speed_in_miles {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the minute that you have run:");
        double total_running_minutes= input.nextDouble();
        
        System.out.println("Enter the total seconds that you have run:");
        double seconds=input.nextDouble();
        
        System.out.println("Enter amount of distance that tou run:");
        double distance=input.nextDouble();
        
        double seconds_to_minutes= seconds/60;
        double minutes_to_hour=seconds_to_minutes+total_running_minutes/60;
        
        double kilometer_to_mile= 0.625*distance;
        
        double speed=(kilometer_to_mile/minutes_to_hour);
        
        System.out.println("The average speed of you is:"+speed);
        System.out.println("Be careful this programm is for running less than 1hr");
        System.out.println("if you enter minutes more than 59 the result is not correct.");

    }
    
}
