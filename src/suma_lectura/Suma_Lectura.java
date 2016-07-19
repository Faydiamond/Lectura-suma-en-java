/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_lectura;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Suma_Lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables:
        String Num1=JOptionPane.showInputDialog("ingrese un número");
        String Num2=JOptionPane.showInputDialog("ingrese un número");
        String Num3=JOptionPane.showInputDialog("ingrese un número");
        String Num4=JOptionPane.showInputDialog("ingrese un número");
        int Numero1=Integer.parseInt(Num1);
        int Numero2=Integer.parseInt(Num2);
        int Numero3=Integer.parseInt(Num3);
        int Numero4=Integer.parseInt(Num4);
        //Asignacion De la operación
        double Multiplicacion=Numero1*Numero2*Numero3*Numero4;
    }
    
}
