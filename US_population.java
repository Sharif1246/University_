
package us_population;


public class US_population {

    public static void main(String[] args) {
        long currentPopulation = 312032486;

        double secondsPerYear = 365 * 24 * 60 * 60;

        double birthsPerYear = secondsPerYear / 7.0;
        double deathsPerYear = secondsPerYear / 13.0;
        double immigrantsPerYear = secondsPerYear / 45.0;

        double yearlyChange = birthsPerYear - deathsPerYear + immigrantsPerYear;

        if (true) {
            currentPopulation += yearlyChange;
            System.out.println("Year 1: " + currentPopulation);
        }

        if (true) {
            currentPopulation += yearlyChange;
            System.out.println("Year 2: " + currentPopulation);
        }

        if (true) {
            currentPopulation += yearlyChange;
            System.out.println("Year 3: " + currentPopulation);
        }

        if (true) {
            currentPopulation += yearlyChange;
            System.out.println("Year 4: " + currentPopulation);
        }

        if (true) {
            currentPopulation += yearlyChange;
            System.out.println("Year 5: " + currentPopulation);
        }
    }
    
}
