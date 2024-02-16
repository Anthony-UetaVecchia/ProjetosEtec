/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Ex03 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insira o valor de a: ");
        double a = s.nextDouble();
        System.out.println("Insira o valor de b: ");
        double b = s.nextDouble();
        
        double div = a / b;
        
        System.out.println("A divisão de " + a + " mais " + b + " é " + div);
    }
}
