/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_mcd;

/**
 *
 * @author invitado
 */
public class EVA1_15_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("el maximo comun divisor de 180 y 48 es " + mcd(180,48));              
    }
    public static int mcd(int dividendo, int divisor){

       if (divisor == 0) {
        return dividendo;
    } else {
        return mcd(divisor, dividendo % divisor);
    }
    }
}
    

   
