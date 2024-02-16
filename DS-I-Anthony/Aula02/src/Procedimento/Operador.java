/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o número b: "));

        int soma = a + b;

        JOptionPane.showMessageDialog(null, "O valor da soma é " + soma);
    }

    void subtracao() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o número b: "));

        int sub = a - b;

        JOptionPane.showMessageDialog(null, "O valor da subtração é " + sub);
    }

    void multiplicacao() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o número b: "));

        int mult = a * b;

        JOptionPane.showMessageDialog(null, "O valor da multiplicação é " + mult);
    }

    void divisao() {
        double a = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a: "));
        double b = Integer.parseInt(JOptionPane.showInputDialog("Insira o número b: "));

        double div = a / b;

        JOptionPane.showMessageDialog(null, "O valor da divisão é " + div);
    }
}
