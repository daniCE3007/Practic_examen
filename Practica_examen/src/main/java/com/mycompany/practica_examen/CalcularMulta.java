/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_examen;
import javax.swing.JOptionPane;


/**
 *
 * @author danic
 */
public class CalcularMulta {
    
    //Atributos
    private String Usuario;
    
    //Constructor:
    public CalcularMulta(String Usuario) {
        this.Usuario = Usuario;
    }
    
    //Getter:
    public String getUsuario() {
        return Usuario;
    }    


    //Setter:
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

   
    
    //Metodos: 
    public void calcularMulta(){
    float Velocidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese "
            + "la velocidad del usuario"));
    while(Velocidad!=0){
        if(Velocidad>100 && Velocidad<=120){
            JOptionPane.showMessageDialog(null,"La multa de "
                    +Usuario+" es de 10 000");
            break;
        }else if(Velocidad>120&& Velocidad<=150){
            JOptionPane.showMessageDialog(null, "La multa de "
                    + Usuario + " es de 20 000");
            break;
        }else if(Velocidad>150){
            JOptionPane.showMessageDialog(null, "La multa de "
                    + Usuario + " es de 50 000");
            break;
        }else{
        JOptionPane.showMessageDialog(null, Usuario + "No"
                + "requiere de una multa");
        break; 
        }
    }
    }
    }

