
package local_cities_time;

import java.util.Scanner;
public class Local_cities_time {

   
    public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
         System.out.println("Enter your location:");
         String name=input.next();
         
         if(name.equalsIgnoreCase("Kabul")){
         long total_miliseconds = System.currentTimeMillis();
         long total_seconds= total_miliseconds/1000;
         long current_second= total_seconds%60;
         long total_minute= (total_seconds/60)+30;
         long current_minute= total_minute%60;
         long total_hour=(total_minute/60)+4;
         long current_hour=total_hour%24;
             System.out.println("The time in kabul city is:");
             System.out.println(current_hour+":"+current_minute+":"+current_second);}
               
         
         if(name.equalsIgnoreCase("tokyo")){
         long total_miliseconds = System.currentTimeMillis();
         long total_seconds= total_miliseconds/1000;
         long current_second= total_seconds%60;
         long total_minute= (total_seconds/60)+0;
         long current_minute= total_minute%60;
         long total_hour=(total_minute/60)+9;
         long current_hour=total_hour%24;
             System.out.println("The time in Tokyo city is:");
             System.out.println(current_hour+":"+current_minute+":"+current_second);}
               
             if(name.equalsIgnoreCase("paris")){ 
         long total_miliseconds = System.currentTimeMillis();
         long total_seconds= total_miliseconds/1000;
         long current_second= total_seconds%60;
         long total_minute= (total_seconds/60)+0;
         long current_minute= total_minute%60;
         long total_hour=(total_minute/60)+9;
         long current_hour=total_hour%24;
             System.out.println("The time in paris city is:");
             System.out.println(current_hour+":"+current_minute+":"+current_second);}   
             
          if(name.equalsIgnoreCase("riyath")){   
         long total_miliseconds = System.currentTimeMillis();
         long total_seconds= total_miliseconds/1000;
         long current_second= total_seconds%60;
         long total_minute= (total_seconds/60)+0;
         long current_minute= total_minute%60;
         long total_hour=(total_minute/60)+3;
         long current_hour=total_hour%24;
             System.out.println("The time in riyath city is:");
             System.out.println(current_hour+":"+current_minute+":"+current_second);}
    }
    
}
