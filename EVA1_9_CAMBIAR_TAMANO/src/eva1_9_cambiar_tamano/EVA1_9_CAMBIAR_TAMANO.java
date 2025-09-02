/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_cambiar_tamano;

/**
 *
 * @author invitado
 */
public class EVA1_9_CAMBIAR_TAMANO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] arreglo = new int[10];
        llenar(arreglo);
        imprimir(arreglo);
        //cambiar el arreglo de tamaño
        System.out.println("");
        
        int nuevoTamanio = 5;
        int[] nuevoArreglo = new int[nuevoTamanio];
        
        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i];
        }
        arreglo = nuevoArreglo;
        
        
        System.out.println("Arreglo redimensionado a " + arreglo.length + " elementos:");
        imprimir(arreglo);
  
    
     
    }
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        
    }
        public static void imprimir(int[] datos){
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
            
    }
    
}
