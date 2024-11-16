import patrones_disenio.observer.Manager;
import patrones_disenio.observer.Usuario;

/**
 *
 * @author victor-briseno
 * @Archivo: POO JAVA
 * @Clase: programacion orientada a objetos
 * @Ciclo: 2025-1
 */
    

public class programacionPOO {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Usuario usuario = new Usuario("Victor");
        
        manager.agregarSubscriptor(usuario);
        
        manager.publicarNewsletter("Buenos días amores");
        
        System.exit(1);
    }
}
