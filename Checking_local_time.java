
package checking_local_time;

import java.util.Scanner;

public class Checking_local_time {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("enter your city name to check the time: ");
        String name = input.next();
        
        if (name.equalsIgnoreCase("kabul")) {

        long total_miliseconds = System.currentTimeMillis();
        long total_second = total_miliseconds / 1000;
        long current_second = total_second % 60;
        long total_minute = (total_second / 60) + 30;
        long current_minute = total_minute % 60;
        long total_hour = (total_minute / 60) + 4;
        long current_hour = total_hour % 24;
        
            System.out.println(current_hour + ":" + current_minute + ":" + current_second);
        }
        
        else if (name.equalsIgnoreCase("berlin")) {
            
        long total_miliseconds = System.currentTimeMillis();
        long total_second = total_miliseconds / 1000;
        long current_second = total_second % 60;
        long total_minute = (total_second / 60);
        long current_minute = total_minute % 60;
        long total_hour = (total_minute / 60) + 2;
        long current_hour = total_hour % 24;
        
        System.out.println(current_hour + ":" + current_minute + ":" + current_second);
        }
    }
    
}
