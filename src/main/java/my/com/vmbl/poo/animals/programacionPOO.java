package my.com.vmbl.poo.animals;

import my.com.vmbl.poo.figuras.Cuadrado;
import my.com.vmbl.poo.figuras.Figura;

/**
 *
 * @author victor-briseno
 * @Archivo: POO JAVA
 * @Clase: programacion orientada a objetos
 * @Ciclo: 2025-1
 */
    

public class programacionPOO {
    public static void main(String[] args) {
        Animal perro = new Perro();
        
        perro.comer();
        
        Figura cuadrado = new Cuadrado(5);
        int area = cuadrado.calcularArea();
        
        System.out.println(""+area);
    }
}
