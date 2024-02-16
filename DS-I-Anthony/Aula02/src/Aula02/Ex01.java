/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Ex01 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        String nome = s.nextLine();
        
        System.out.println("Quantos anos você tem? ");
        String idade = s.nextLine();
        System.out.println("Seu nome é " + nome + ", e eu você ira se tornar o Rei dos Piratas");
        System.out.println("E você possui " + idade + " anos");
    }
}
