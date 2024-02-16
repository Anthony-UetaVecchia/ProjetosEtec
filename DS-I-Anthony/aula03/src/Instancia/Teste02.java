/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Teste02 {

    public static void main(String[] args) {

        FuncoesCalculo chamar = new FuncoesCalculo();
        try{
            
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o operador"));

        if (operacao == 1) {
            chamar.soma();
        } else if (operacao == 2) {
            chamar.subtracao();

        } else if (operacao == 3) {
            chamar.multiplicacao();
        } else if (operacao == 4) {
            chamar.divisao();
        } else {
            System.out.println("VALOR INVÁLIDO");
        }
     
    }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO");
            }
        }
    }
