
package random_poitn_in_rectangle;

public class Random_poitn_in_rectangle {

    public static void main(String[] args) {
     int width=100;
     int height=200;
     
     double x=(Math.random()*width)-(width/2);
     double y=(Math.random()*200)-(height/2);
     
        System.out.println("Random point in rectangle:("+x+","+y+")");
      
      
      
    }
    
}
