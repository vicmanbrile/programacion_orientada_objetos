package my.com.vmbl.poo.polimorfismo;

/**
 *
 * @author victor-briseno
 */
public abstract class AsistenteClase {
    public abstract void presentacion();
    public abstract void examen();
    public abstract void proyecto();
    public abstract String ToString();
    
    private String contra;
    protected int ID;
    
    public void setContra(String contra){
        this.contra = contra;
    }
    
}

