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
public class Ex02 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insira o valor de a: ");
        int a = s.nextInt();
        System.out.println("Insira o valor de b: ");
        int b = s.nextInt();
        
        int soma = a+b;
        
        System.out.println("A soma de " + a + " mais " + b + " é " + soma);
    }
}
