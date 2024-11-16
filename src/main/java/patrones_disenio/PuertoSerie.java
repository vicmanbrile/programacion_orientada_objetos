/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_disenio;

/**
 *
 * @author victor-briseno
 */
public class PuertoSerie {
    
    private static PuertoSerie instancia;
    private PuertoSerie(){
        System.out.println("Constructor PuertoSerie");
    }
    
    public static PuertoSerie obtenerInstancia(){
        if (instancia == null){
            instancia = new PuertoSerie();
        }
        return instancia;
    }
}
