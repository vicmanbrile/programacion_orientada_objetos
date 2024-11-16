package patrones_diseno.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victor-briseno
 */
public class Tarea3 implements Tarea{

    @Override
    public void ejecutar() {
                
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Decorator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
