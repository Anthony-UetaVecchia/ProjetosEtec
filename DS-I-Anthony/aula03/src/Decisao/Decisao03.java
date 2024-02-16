/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decisao;
import javax.swing.JOptionPane;



public class Decisao03 {
    public static void main(String[] args) {
    
    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado: "));
    int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado: "));
    
    
    
    if(a == b && b == c){
        System.out.println("Triângulo equilátero");
    }else if(a == b || a == c || b == c){
        System.out.println("Triângulo isósceles");
    }else if(a != b || a!= c || b!= c){
        System.out.println("Triângulo escaleno");
    }else if (a == 0 || b == 0 || c == 0){
        System.out.println("INVÁLIDO");
    }else{
        System.out.println("INVÁLIDO");
    }
    
    
    }
    
}
