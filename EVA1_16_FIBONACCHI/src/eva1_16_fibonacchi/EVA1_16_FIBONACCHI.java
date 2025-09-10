/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_fibonacchi;

/**
 *
 * @author invitado
 */
public class EVA1_16_FIBONACCHI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Fibonacci(6) = " + fibonacci(6));
    }
    public static int fibonacci(int posi){
        
        if (posi == 1 || posi == 0 ) {
            return 1;
        }
  
        return fibonacci(posi - 1) + fibonacci(posi - 2);
    
    
    }
}
