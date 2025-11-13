
package wind_chll_temprature_using_if;

import java.util.Scanner;

public class Wind_chll_temprature_using_if {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      
        System.out.println("Enter the tempreture in farenheit between -58F 41F:");
        double tem=input.nextDouble();
        
        System.out.println("Enter the wind speed(>=2) in miles per hour");
        double ws=input.nextDouble();
        
        boolean valid_tempreture=(tem>=-58)&&(tem<=41);
        boolean validwindspeed=(ws>=2);
        
        if((valid_tempreture) && (validwindspeed)){
            double windchill=  35.74+0.6215*tem-35.75*Math.pow(ws, 0.16)+0.4275*tem*Math.pow(ws, 0.16);
            System.out.println("The wind chill is:"+windchill); }
        else{
            System.out.println("Invalid input:"); }
        
        if(!valid_tempreture){
            System.out.println("Tempreture should between -58F and 41F");}
        
        if(!validwindspeed){
            System.out.println("The wind speed should be bigger or equal to 2 mph");}
    }
    
}
