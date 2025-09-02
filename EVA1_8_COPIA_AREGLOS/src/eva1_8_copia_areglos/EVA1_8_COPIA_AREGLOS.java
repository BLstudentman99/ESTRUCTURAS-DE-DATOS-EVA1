/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_copia_areglos;
import java.util.Arrays;
/**
 *
 * @author invitado
 */
public class EVA1_8_COPIA_AREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        llenar(arreglo);
        imprimir(arreglo);
        //copia del arreglo.
        int[] copiaArreglo = new int[10];
       
        System.out.println("");
        for (int i = 0; i < arreglo.length; i++) {
             copiaArreglo[i] = arreglo[i];
              System.out.print("[" + copiaArreglo[i] + "]");
        }
        
        
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






 //System.arraycopy(arreglo, 0, copiaArreglo, 0, arreglo.length);
//System.out.println(Arrays.toString(copiaArreglo));