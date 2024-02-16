package Exercicios;

public class Ex04 {

    int pares = 0;
    int impares = 0;
    
    void impapar() {
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " - Par");
                pares = pares + i;
            } else {
                System.out.println(i + " - ímpar");
                impares = impares + i;
            }
            
        }
        
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        
        if (pares > impares){
            System.out.println("A soma dos números pares é maior que a de ímpares");
        }else{
            System.out.println("A soma dos números ímpares é maior que a de pares");
        }
    }
}
