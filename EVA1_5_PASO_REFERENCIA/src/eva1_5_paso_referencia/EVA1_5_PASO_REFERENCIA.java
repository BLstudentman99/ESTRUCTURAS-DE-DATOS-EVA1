/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_paso_referencia;

/**
 *
 * @author invitado
 */
public class EVA1_5_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Foo objeto = new Foo();
        process(objeto);//tambien enviamos una copia pero de la dirección del objeto.
        System.out.println("objeto.valor = " + objeto.valor);
        
    }
    
    public static void process(Foo obj){
        obj.valor = 9999;
    }
}
    
    class Foo{
        int valor = 0;
    
    }
    

