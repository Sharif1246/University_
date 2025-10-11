
package approximate_pi_result;

public class Approximate_pi_result {

    public static void main(String[] args) {
        
        double pi1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
        double pi2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 - 1.0/15);

        System.out.println("Result of first approximation: " + pi1);
        System.out.println("Result of second approximation: " + pi2);

    }
    
}
