/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.com.vmbl.poo.figuras;

/**
 *
 * @author vicmanbrile
 */
public class Circulo implements Figura {
    double  radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public double  calcularArea(){
        return (this.radio*2) * Math.PI;
    }
}
