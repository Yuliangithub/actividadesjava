      
package Arreglos_arrays2;


import java.util.Scanner;

public class Arreglos_arrays2 {

    public static void main(String[] args) {
        int numeros []= new int [5];
        int numero;
        
        Scanner os = new Scanner (System.in);
        
        for (int i=0 ; i < numeros.length; i++) {
        System.out.println("ingrese un numero");
        numero=os.nextInt();
        numeros [i]=numero;
    }
        System.out.println("el arreglo es : ");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]+", ");
        }
    }
    
}
