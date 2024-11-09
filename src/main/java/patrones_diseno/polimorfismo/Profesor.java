package patrones_diseno.polimorfismo;

/**
 *
 * @author victor-briseno
 */
public class Profesor extends AsistenteClase{
    String nombre;
    String correo;
        
    public Profesor(String nombre, String correo, String contra, int id){
        this.nombre = nombre;
        this.correo = correo;
        
        setContra(contra);
        this.ID = id;
    }
    
    @Override
    public void presentacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void examen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void proyecto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String ToString(){
        return "Profesor(" + this.nombre + ") Correo: " + this.correo;
    }
}
