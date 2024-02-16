package Exercicios;

public class Ex02 {

    public static void main(String[] args) {
        int soma = 0;
        int total = 0;

        for (int i = 0; i < 11; i++) {
            total = i + soma;

            System.out.println(i + " + " + soma + " = " + total);

            soma = soma + i;

        }
    }
}
