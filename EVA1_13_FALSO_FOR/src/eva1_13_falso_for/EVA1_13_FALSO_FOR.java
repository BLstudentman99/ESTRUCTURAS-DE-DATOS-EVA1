/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_falso_for;

/**
 *
 * @author invitado
 */
public class EVA1_13_FALSO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        falsoFor(5); //5 - 4 - 3 - 2 - 1 
        falsoForUp(10,1);
    }
    public static void falsoFor(int val){
        System.out.print(val + " - "); //Resolver un problema
        if(val > 1)//debemos detener la recursividad
            falsoFor(val - 1);//Llamarse a si mismo
        
        System.out.println("");
    }
   
    
    public static void falsoForUp(int val2, int valIni){
        System.out.print(val2 + " - ");
 
        if(valIni < val2)
            falsoForUp(val2, valIni + 1);
    
    }
}
