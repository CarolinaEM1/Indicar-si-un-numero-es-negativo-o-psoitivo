/*
 Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        while (numero !=0) { // mientras el número sea diferente de 0
            if (numero>0){
                System.out.println("El número "+numero+" es positivo");
            }
            else {
                System.out.println("El número "+numero+" es negativo");
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
            
        }
    }
    
}
