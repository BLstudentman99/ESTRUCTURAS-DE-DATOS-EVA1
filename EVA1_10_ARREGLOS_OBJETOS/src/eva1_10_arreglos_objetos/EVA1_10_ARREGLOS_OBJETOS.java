/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_arreglos_objetos;

/**
 *
 * @author invitado
 */
public class EVA1_10_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arreglo = new Ejemplo[2];
        System.out.println(arreglo);
        arreglo[0] = new Ejemplo();
        System.out.println(arreglo[0]);
        System.out.println(arreglo[0].val);
        arreglo[1] = new Ejemplo();
        System.out.println(arreglo[1]);
        System.out.println(arreglo[1].val);
    }
    
}

class Ejemplo{
    int val = 100;

}

