/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_paso_valor;

/**
 *
 * @author invitado
 */
public class EVA1_4_PASO_VALOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int someValue = 7;
        process(someValue); 
        System.out.println(someValue);
        //siempre que se manda un valor a una funcion se manda una copia.      
    }
    public static void process(int value){
        value = 10;
    }
}
