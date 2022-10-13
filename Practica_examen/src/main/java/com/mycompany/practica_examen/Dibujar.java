/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_examen;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Dibujar {

    public void DibujarT() {

        String linea = "   ";

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de asteriscos que contendra la T"));

        int i = 1;

        while (i > 0) {
            if ((numero % 2) == 0 || numero < 3) {

                numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "El numero no puede ser par o menor que 3, "
                        + "ingrese el numero nuevamente"));

            } else {
                int div_entera = (numero / 2) - (numero % 2);

                for (int z = 0; z < div_entera; z++) {
                    linea = linea + "   ";
                }

                for (int x = 1; x <= numero; x++) {
                    System.out.print(" * ");
                }
                System.out.println(" ");
                for (int y = 1; y < numero; y++) {
                    System.out.println(linea + " * " + linea + "\n");
                }
                i = 0;
            }
        }
    }

}
