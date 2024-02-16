package Desafio;

import javax.swing.JOptionPane;

    public class Desafio {
      void areaTri() {
        try {
            double b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
            double h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
            
            double area = (b*h)/2;
                    
            System.out.println("A área desse triângulo é: " + area);
        }catch (Exception e){
            System.out.println("Caractere Inválido");
        }
    }
    
    void areaQuad() {
        try {
            double b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do quadrilátero: "));
            double h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do quadrilátero: "));
            
            double area = b*h;
                    
            if(b == h){
                System.out.println("A área desse quadrado é: " + area);
            }else{
                System.out.println("A área desse retângulo é: " + area);
            }
        }catch (Exception e){
            System.out.println("Caractere Inválido");
        }
    }
    
}
