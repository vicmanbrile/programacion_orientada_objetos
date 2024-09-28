import my.com.vmbl.poo.figuras.Figura;
import my.com.vmbl.poo.figuras.Circulo;
import my.com.vmbl.poo.figuras.Cuadrado;

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

        
        System.out.println("La area del cuadrado es: "+cuadrado.calcularArea()+"\n");
        
        System.out.println("La area del cuadrado es: "+circulo.calcularArea()+"\n");

    }
}
