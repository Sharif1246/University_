
package multiplacation_table;

public class Multiplacation_table {

    public static void main(String[] args) {
      int numbers=10;
      
      for(int i=1; i<=numbers;i++){
          for(int j=2;j<=numbers;j++){
               System.out.print(i + "x" + j + "=" + (i * j) + "\t"); 
          
          }
      
          System.out.println("");

      }    
        

      
    }
}

