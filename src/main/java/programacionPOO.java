
import my.com.vmbl.poo.animals.Animal;
import my.com.vmbl.poo.animals.Perro;
import my.com.vmbl.poo.figures.Cuadrado;
import my.com.vmbl.poo.figures.Figura;
import my.com.vmbl.poo.polimorfismo.Profesor;

/**
 *
 * @author victor-briseno
 * @Archivo: POO JAVA
 * @Clase: programacion orientada a objetos
 * @Ciclo: 2025-1
 */
    

public class programacionPOO {
    public static void main(String[] args) {
        
        
        Figura cuadrado = new Cuadrado(5);
        Figura circulo = new Circulo(5);

        
        System.out.println(""+area);
        
        
        Profesor profesor = new Profesor("Victor", "vicmanbrile@hotmail.com");
        
        System.out.print(profesor.ToString());
    }
}
