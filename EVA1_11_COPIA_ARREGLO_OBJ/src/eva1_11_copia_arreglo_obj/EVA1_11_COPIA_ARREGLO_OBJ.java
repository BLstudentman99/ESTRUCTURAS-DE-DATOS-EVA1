package eva1_11_copia_arreglo_obj;

/**
 *
 * @author invitado
 */
public class EVA1_11_COPIA_ARREGLO_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona[] arreglo = new Persona[2];
       arreglo[0] = new Persona("Erick", "Anchondo");
       
       //System.out.println(arreglo[0].getNombre());
       //System.out.println(arreglo[0].getApellido());
       
       arreglo[1] = new Persona("Pedronic" ,"Tejuinas");
       //System.out.println(arreglo[1].getNombre());
       //System.out.println(arreglo[1].getApellido());
       
       //COPIA
       
       Persona[] arregloCopia = new Persona[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
           arregloCopia[i] = new Persona(arreglo[i].getNombre(), arreglo[i].getApellido());
        }
        
        System.out.println("\nDatos del arreglo copiado:");
        System.out.println("Posicion 0: " + arregloCopia[0].getNombre() + " " + arregloCopia[0].getApellido());
        System.out.println("Posicipn 1: " + arregloCopia[1].getNombre() + " " + arregloCopia[1].getApellido());
        
        arreglo[0].setNombre("NuevoErick");
        System.out.println("Arreglo original luego del cambio: " + arreglo[0].getNombre());
        System.out.println("Arreglo copiado luego del cambio: " + arregloCopia[0].getNombre());
        
        }
       
    
}

class Persona{
    private String nombre;
    private String apellido;
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    } 
    
}
    
    


