/*
 * TestIntegrador01.java
 *
 */

/**
 *
 * @author Sebastian S. Sanga <SebastianSanga@educacionIT.com.ar>
 */
public class Programa {
    
    /** Creates a new instance of TestIntegrador01 */
    public Programa() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Construye e informa un auto
        System.out.println("\nCreando una persona....");
        Persona p1 = new Persona("Juan", "Hernandez", "22.639.456");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("Numero de Documento: " + p1.getNumeroDocumento());
        
        // Construye e informa un vehiculo
        System.out.println("\nCreando un vehiculo....");
        Vehiculo v1 = new Vehiculo(215, 345, 98);
        System.out.println("Ancho:" + v1.getAncho());
        System.out.println("Altura: " + v1.getAltura());
        System.out.println("Largo: " + v1.getLargo());
        
    }
    
}
