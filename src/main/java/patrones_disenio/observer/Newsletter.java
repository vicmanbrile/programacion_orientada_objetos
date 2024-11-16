package patrones_disenio.observer;

/**
 *
 * @author victor-briseno
 */
public interface Newsletter {
    void agregarSubscriptor(Suscriptor s);
    void eliminarSubcriptor(Suscriptor s);
    
    void notificar();
}
