
package random_month;
import java.util.Random;

public class Random_month {

    public static void main(String[] args) {
        Random rand=new Random();

        int month_number=rand.nextInt(12)+1;

        String month_name;
        
        switch (month_number) {
            case 1:month_name = "january";break;
            case 2:month_name = "february";break;
            case 3:month_name = "March";break;
            case 4:month_name = "April";break;
            case 5:month_name = "May";break;
            case 6:month_name = "June";break;
            case 7:month_name = "July";break;
            case 8:month_name = "Agust";break;
            case 9:month_name = "September";break;
            case 10:month_name = "October";break;
            case 11:month_name = "November";break;
            case 12:month_name = "December";break;
            default: month_name="invalid input";

        }
        System.out.println("Random month number"+month_number);
        System.out.println("month name"+month_name);
        
        
        
        
        
        
    }
    
}
