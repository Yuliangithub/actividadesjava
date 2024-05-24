package do_while;

public class Do_while {


    public static void main(String[] args) {
        
       int i=1;
       int a=0;
       int aux;
       do {
           System.out.println( i );
           aux = i;
           i=i + a;
           a = aux;
           
       } while (i<56);
       
        System.out.println("sucesion terminada a 56");        
       }
    }
    

