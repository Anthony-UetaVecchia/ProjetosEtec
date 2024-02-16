package Exercicios;

public class Ex03 {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int result = 0;

        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                System.out.println(n1);
                System.out.println(n2);
            }

            result = n1 + n2;
            n1 = n2;
            n2 = result;

            System.out.println(result);

        }
    }
}
