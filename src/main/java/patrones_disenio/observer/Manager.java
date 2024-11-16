package patrones_disenio.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor-briseno
 */
public class Manager implements Newsletter {
    private final List<Suscriptor> suscriptores = new ArrayList<>();
    private String ultimaNewsletter;
    
    public void publicarNewsletter(String newlatter){
       this.ultimaNewsletter = newlatter;
       notificar();
    }

    @Override
    public void agregarSubscriptor(Suscriptor s) {
        suscriptores.add(s);
    }

    @Override
    public void notificar() {
        for (Suscriptor s : suscriptores){
            s.actualizar(ultimaNewsletter);
        }
    }

    @Override
    public void eliminarSubcriptor(Suscriptor s) {
        this.suscriptores.remove(s);
    }
    
    
}
