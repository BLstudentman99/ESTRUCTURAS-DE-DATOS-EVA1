/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_numero_primo;

/**
 *
 * @author invitado
 */
public class EVA1_17_NUMERO_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3089;
        System.out.println(esPrimoNoEficiente(n));
        int m = 3089;
        System.out.println(esPrimoEficiente(m));
    }
    
    public static boolean esPrimoNoEficiente(int n){ 
       if (n <= 1){
           return false;
       }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
            
        }
        return true; 
        
    }
    
    public static boolean esPrimoEficiente(int m){
        if (m <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(m); i++) {
          if (m % i == 0){
                return false;
            }   
        }
      return true;
    }
}
