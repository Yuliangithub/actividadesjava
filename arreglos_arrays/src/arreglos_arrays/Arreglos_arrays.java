
package Arreglos_arrays; 

import java.util.Arrays;

public class Arreglos_arrays {


    public static void main(String[] args) {
    
 String dias[]={"lunes", "martes", "miercoles", "jueves"};
    
     System.out.println(Arrays.toString (dias));
     
        System.out.println("imprimiendo desde el ciclo for");
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]+ ", ");
        }    
          
    
    
}
}