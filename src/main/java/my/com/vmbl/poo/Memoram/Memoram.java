package my.com.vmbl.poo.Memoram;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Memoram {
    private static Integer primeraTarjeta;
    private static Integer segundaTarjeta;


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        CrearTarjetas();
        
        ImprimirTablero();
                
        do {
            System.out.print(("Seleccione un numero entre 1 al 16 o 'salir' para finalizar el juego\n"));
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                salir = true;
                continue;
            }


            if (esNumero(entrada)) {
                int numero = Integer.parseInt(entrada);
                
                clear();
                
                if(tablero.get(numero - 1).isVisible()){
                    System.out.println("Esta tarjeta ya esta descubierta. Selecciona otra.");
                }else if (primeraTarjeta == null && segundaTarjeta == null){
                    primeraTarjeta = numero-1;
                    tablero.get(primeraTarjeta).setVisible(true);
                    
                } else if (segundaTarjeta == null) {
                    segundaTarjeta = numero-1;
                    // Comprobar que la primeraTarjeta y la segundaTarjeta tengan el mismo valor 
                    Tarjeta t1 = tablero.get(primeraTarjeta);
                    Tarjeta t2 = tablero.get(segundaTarjeta);

                    if (t1.getValor().equals(t2.getValor())){
                        if (!t2.isVisible()){
                            tablero.get(primeraTarjeta).setVisible(true);
                        } else {
                            continue;
                        }
                        
                        primeraTarjeta = null;
                        segundaTarjeta = null;
                    } else {
                        t1.setVisible(false);
                        t2.setVisible(false);
                        
                        primeraTarjeta = null;
                        segundaTarjeta = null;
                    }
                } else {
                    System.out.print("Algo no funciona correctamente");
                }
                
                ImprimirTablero();
                
            } else {
                System.out.println("Has ingresado un comando no valido.");
            }
            // Verificar si todas las tarjetas están descubiertas
            if (tablero.stream().allMatch(Tarjeta::isVisible)) {
                System.out.println("\n¡Felicidades! Has completado el juego. 🎉");
                salir = true; // Salir del bucle
            }
                    
        } while (!salir);
        
    }
    
    private static List<Tarjeta> tablero;
    
    private static void CrearTarjetas() {
        tablero = new ArrayList<>();
        String[] valores = {"vaca", "perro", "gato", "gallina", "delfin", "rinoceronte", "pato", "ganso", "vaca", "perro", "gato", "gallina", "delfin", "rinoceronte", "pato", "ganso"};
       
        
        for (String valor : valores) {
            tablero.add(new Tarjeta(valor));
        }
        
        Collections.shuffle(tablero);

    }
    
    
    
    private static boolean esNumero(String entrada) {
        try {
            Integer.valueOf(entrada); // Intenta convertir a número entero
            return true;
        } catch (NumberFormatException e) {
            return false; // Si lanza una excepción, no es un número
        }
    }
    
    private static void ImprimirTablero(){
        
        int columnas = 4;
        for (int i = 0; i < tablero.size(); i++) {

            System.out.printf("%2d) ", i + 1);

            if (tablero.get(i).isVisible()) {
                System.out.print(tablero.get(i).getValor() + " ");
            } else {
                System.out.print("? ");
            }

            if ((i + 1) % columnas == 0) {
                System.out.println();
            }
        }
        
    }
    
    private static void clear(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

class Tarjeta {
    private final String valor;
    private boolean visible;

    public Tarjeta(String valor) {
        this.valor = valor;
        this.visible = false;
    }

    public String getValor() {
        return valor;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}