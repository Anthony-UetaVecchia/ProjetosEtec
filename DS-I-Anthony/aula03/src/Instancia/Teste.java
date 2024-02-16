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
public class Teste {
    public static void main(String[] args) {
        
    
        FuncoesCalculo chamar = new FuncoesCalculo();
        
        String operacao = JOptionPane.showInputDialog("Digite o operador(simbolo): ");
        
        if(operacao.equals("+")) {
            chamar.soma();
        
        }else if(operacao.equals("-")){
            chamar. subtracao();
        }else if(operacao.equals("*")){
            chamar.multiplicacao();
        }else if(operacao.equals("/")){
            chamar.divisao();
        }else{
            System.out.println("VALOR INVÁLIDO");
        }
    }
}
