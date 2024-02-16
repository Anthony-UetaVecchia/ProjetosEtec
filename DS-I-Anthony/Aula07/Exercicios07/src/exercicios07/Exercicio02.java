package exercicios07;

public class Exercicio02 {
    public static void main(String[] args) {
        int i = 0;
        int pares = 0;
        int impares = 0;
                
        while(i<101){
            if(i%2==0){
                System.out.println(i + " - par");
                pares = pares + i;
            }else{
                System.out.println(i + " - impar");
                impares = impares + i;
            }
            
            i++;
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
