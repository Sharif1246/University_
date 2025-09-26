
package finding_triangle_angels;

import java.util.Scanner;
public class Finding_triangle_angels {

    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1:");
        double x1 = input.nextDouble();
        System.out.println("Enter y1:");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.println("Enter y2");
        double y2 = input.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.println("Enter y3");
        double y3 = input.nextDouble();

        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));//حالا ما طول هر ضلع مثلث را پیدا میکنیم 
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); 
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); 

        
        double angleA = Math.toDegrees(Math.acos((-b*b - c*c +a*a) / (-2*b*c)));// با استفاده از قضییه کوساین البته در اینجا ما خود قضیه کوساین زا طورس تغییر دادیم که مستقیما زاویه پیدا کنیم
        double angleB = Math.toDegrees(Math.acos((-a*a - c*c + b*b) / (-2*a*c)));
        double angleC = Math.toDegrees(Math.acos((-a*a - b*b + c*c) / (-2*a*b)));

        
        System.out.println("The angles of the triangle are:");
        System.out.printf("Angle A: %.2f degrees\n", angleA);
        System.out.printf("Angle B: %.2f degrees\n", angleB);
        System.out.printf("Angle C: %.2f degrees\n", angleC);


        scanner.close();   
     
    }
    
}
