/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;
import javax.swing.JOptionPane;

public class FuncoesCalculo {
    void soma () {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        int soma = a + b;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + soma);
    }

    void subtracao () {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        int subtracao = a - b;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + subtracao);
    
    }
    void multiplicacao () {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        int multiplicacao = a * b;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + multiplicacao);
    
    }
    
    void divisao () {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        int divisao = a / b;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + divisao);
    
    }
  
}









/* () é para saber que dentro terá uma função*/