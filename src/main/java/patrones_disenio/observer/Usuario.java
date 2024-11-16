package patrones_disenio.observer;

/**
 *
 * @author victor-briseno
 */
public class Usuario implements Suscriptor{
    private String nombre;
    
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(String contenido) {
        System.out.println(nombre + ", te ha llegado nueva newsLatter");
        System.out.println(contenido);
        
    }
    
}
