/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_diseno.decorator;

/**
 *
 * @author victor-briseno
 */
public class Decorator implements Tarea {
    private Tarea t;
    
    public Decorator(Tarea tarea){
        t = tarea;
    }

    @Override
    public void ejecutar() {
        long inicio = System.currentTimeMillis();
        t.ejecutar();
        long fin = System.currentTimeMillis();
        
        long r = fin - inicio;
        
        System.out.println("Ejecucion:" + r);
        
    }
}
