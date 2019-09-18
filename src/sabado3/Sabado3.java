
package sabado3;
import java.util.*;

public class Sabado3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // suma de 2 numeros
        Scanner tec = new Scanner(System.in);
        int capital=150000;
        int interes =0;
        System.out.println("calcular el interes: ");
        System.out.println("digite el capital: ");
        capital=tec.nextInt();
        System.out.println("digite el interes (en %, no escriba el %): ");
        interes=tec.nextInt();
        
        interes = capital*interes/100;    
        // mostrar el interes
        System.out.println(" el interes es"+interes);
        int capitalizacion=capital+interes;
        System.out.println("la capitalizacion es "+capitalizacion);
        
        
    }
    
}
