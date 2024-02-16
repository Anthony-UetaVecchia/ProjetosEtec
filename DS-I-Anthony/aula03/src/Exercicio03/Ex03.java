/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Ex03 {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        int soma = a + b;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + soma);
    }

}
