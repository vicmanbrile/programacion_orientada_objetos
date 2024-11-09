/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_diseno.builder;

/**
 *
 * @author victor-briseno
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String ocupacion;
    private String edad;
    
    public Persona(
            String nombre,
            String apellido,
            String correo,
            String telefono,
            String ocupacion,
            String edad
    ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = correo;
        this.ocupacion = ocupacion;
        this.edad = edad;
    }
}
