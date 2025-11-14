
package guess_birthday4.pkg10;

import java.util.Scanner;

public class Guess_birthday410 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       String set1=
               "1 3 5 7\n"+
               "9 11 13 15\n"+
               "17 19 21 23\n"+
               "25 27 29 31";
       
       String set2=
               "2 3 6 7\n"+
               "10 11 14 15\n"+
               "18 19 22 23\n"+
               "26 27 30 31";
       String set3=
               "4 5 6 7\n"+
               "12 13 14 15\n"+
               "20 21 22 23\n"+
               "28 29 30 31";
       String set4=
               "8 9 10 11\n"+
               "12 13 14 15\n"+
               "24 25 26 27\n"+
               "28 29 30 31";
       String set5=
               "16 17 18 19\n"+
               "20 21 22 23\n"+
               "24 25 26 27\n"+
               "28 29 30 31";
       
       int day=0;
       
        System.out.println("IS your birthday in set 1");
        System.out.println(set1);
        System.out.println("Enter Y for yes and N for no");
         char answer= input.next().toUpperCase().charAt(0);
         if (answer=='y')
             day +=1;
         
         System.out.println("\n is your birthday in set 2: ");
         System.out.println(set2);
         System.out.println("Enter Y for yes and N for no");
         answer =input.next().toUpperCase().charAt(0);
         if (answer=='Y')
             day +=2;
         
         System.out.println("\n is your birthday in set 3: ");
         System.out.println(set3);
         System.out.println("Enter Y for yes and N for no");
         answer =input.next().toUpperCase().charAt(0);
         if (answer=='Y')
             day +=4;
         
         System.out.println("\n is your birthday in set 4: ");
         System.out.println(set4);
         System.out.println("Enter Y for yes and N for no");
         answer =input.next().toUpperCase().charAt(0);
         if (answer=='Y')
             day +=8;
         
         System.out.println("\n is your birthday in set 5: ");
         System.out.println(set5);
         System.out.println("Enter Y for yes and N for no");
         answer =input.next().toUpperCase().charAt(0);
         if (answer=='Y')
             day +=16;
         
         System.out.println("\n Your birthday is on day"+day+"!");
       
    }
    
}
