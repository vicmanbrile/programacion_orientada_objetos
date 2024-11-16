/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_diseno.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victor-briseno
 */
public class Primo implements Tarea{    
    public void proceso() throws InterruptedException{
        Thread.sleep(15000);
    }

    @Override
    public void ejecutar() {
        try {
            proceso();
        } catch (InterruptedException ex) {
            Logger.getLogger(Primo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
