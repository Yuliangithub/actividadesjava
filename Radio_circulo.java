package radio_circulo;

import java.util.Scanner;

public class Radio_circulo {
    public static void main(String[] args) {
   
        Scanner entrada = new Scanner( System.in );
        
        System.out.print("escribe el diametro del circulo");         
                
        double diametro = entrada.nextDouble();
        
        double radio = diametro/2;
        
          System.out.println("el radio del circulo es " + radio);
          
            
    }
    
}
