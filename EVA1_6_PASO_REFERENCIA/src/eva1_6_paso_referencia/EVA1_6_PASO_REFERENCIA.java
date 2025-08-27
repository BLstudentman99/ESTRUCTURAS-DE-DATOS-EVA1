/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_paso_referencia;

/**
 *
 * @author invitado
 */
public class EVA1_6_PASO_REFERENCIA {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        llenar(arreglo);
        imprimir(arreglo);
        int[] arreglo2 = new int[50];
        llenar(arreglo2);
        imprimir(arreglo2);
        int[] arreglo3 = new int[25];
        llenar(arreglo3);
        imprimir(arreglo3);
        
    }
    
    //Llenar usa paso por referencia:
    //recibe la direccion del arreglo y la usa para modificarlo
    
    public static void llenar(int[] datos){
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
        }
        
    }
    //imprimir usa paso por referencia tambien pero no modifica el arreglo, solo lo lee. 
    
    public static void imprimir(int[] datos){
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
         System.out.println("");
}
}
