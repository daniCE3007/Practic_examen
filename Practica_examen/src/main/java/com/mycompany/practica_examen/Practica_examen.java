/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica_examen;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Practica_examen {

    public static void main(String[] args) {

        // menu 1
        int i = 0;
        while (i != 3) {
            int Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "A continuación"
                    + "se le presenta un menu con tres opciones: "
                    + "\n 1. Calcular Multa"
                    + "\n 2. Dibujar T"
                    + "\n 3. Salir"
                    + "\n Digite el número de la opción que desea elegir: "));

            if (Opcion == 1) {

            } else if (Opcion == 2) {
                
                Dibujar Dibujo = new Dibujar();
                Dibujo.DibujarT();
                
            } else {
                JOptionPane.showMessageDialog(null, "Gracias "
                        + "por usar el programa");
                i = 3;
            }
        }

    }
}
