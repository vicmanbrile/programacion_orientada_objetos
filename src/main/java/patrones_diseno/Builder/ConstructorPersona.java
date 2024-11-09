/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_diseno.builder;

/**
 *
 * @author victor-briseno
 */
public class ConstructorPersona {
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String ocupacion;
    private String edad;
    
    
    private Persona p;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    
    public void setEdad(String edad){
        this.edad = edad;
    }
    
    
    
   public Persona construir(){
       return new Persona(nombre, apellido, correo, telefono, ocupacion, edad);
   }
}
