package health_application_bmi;

import java.util.Scanner;

public class Health_application_BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds");
        double weight = input.nextDouble();

        System.out.println("Enter you height in inches");
        double height = input.nextDouble();

        double WinKilo = weight * 0.4535;
        double Hinmeter = height * 0.0254;

        double BMI = WinKilo / (Hinmeter * Hinmeter);

        if (BMI < 18.5) {
            System.out.println("You BMI is:" + BMI + "and you are underweight");}
        else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("You BMI is:"+BMI+"and you are normal");}
        else if(25.0<=BMI&& BMI<30){
             System.out.println("Your BMI is"+BMI+"ANd you are over weight");}
        else{
             System.out.println("Your BMI is:"+BMI+"and you are obese");}
        

    }

}
