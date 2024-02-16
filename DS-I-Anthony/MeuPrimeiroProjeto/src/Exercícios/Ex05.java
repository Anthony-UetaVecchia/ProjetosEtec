/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios;

/**
 *
 * @author CAMARGO
 */

import java.util.Scanner;
public class Ex05 {
    
    public static void main (String [] args) {
        
        Scanner x = new Scanner (System.in);
        
        int b, h;
        
        System.out.println ("Digite o valor da base: ");
          b = x.nextInt();
          
        System.out.println("Digite o valor da altura: ");
          h = x.nextInt();
          
          int a = ((b*h)/2);
          
        System.out.println("O valor da área do triângulo é: " + a);
        
        
        
    }
    
}
