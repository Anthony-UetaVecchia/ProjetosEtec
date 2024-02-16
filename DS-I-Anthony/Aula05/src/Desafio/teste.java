/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio;


import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class teste {
      public static void main(String[] args) {
        Desafio x = new Desafio();
    
        int forma = Integer.parseInt(JOptionPane.showInputDialog(null, "Você deseja calcular a área de um Triângulo(1) ou de um Quadrilátero(2)? "));

        if(forma == 1){
            x.areaTri();
        }else if(forma == 2){
            x.areaQuad();
        }else {
            System.out.println("Caractere Inváido");
        }
    }
}
