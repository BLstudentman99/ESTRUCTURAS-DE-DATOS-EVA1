/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_heap;


public class EVA1_3_HEAP {
    public static void main(String[] args) {
        // variables que estan declaradas de una clase son referencias, direcciones del objeto.
        int x = 5;
        Prueba prueba1 = new Prueba(); //referencia
        Prueba prueba2 = new Prueba(); //referencia
        System.out.println("x = " + x);
        System.out.println("prueba1 = " + prueba1);
        System.out.println("prueba1 = " + prueba2);
        System.out.println("prueba1.valor = " + prueba1.valor);
        System.out.println("prueba2.valor = " + prueba2.valor);
        prueba1= null;//Rompemos el enlace (direccion) entre variable y memoria
        prueba2= null;//Rompemos el enlace (direccion) entre variable y memoria
        
    }
    
}
class Prueba{
    int valor = 100;
}
