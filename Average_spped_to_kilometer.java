
package average_spped_to_kilometer;

public class Average_spped_to_kilometer {

    public static void main(String[] args) {
   
        double mile = 24;// the amount of way that has been changed on mile
        double miletokilometer = 1.6;

        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        double totalHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        double distanceKm = mile * miletokilometer;

        double averageSpeed = distanceKm / totalHours;

        System.out.printf("The average speed is %.2f km/h%n", averageSpeed);
    }
}

