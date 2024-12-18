import java.util.*;
public class NumeroDeLinhasFor {
    public static void main(String[] args) {
        
        Scanner dado_digitado = new Scanner(System.in);

        System.out.print("Digite um valor para n (entre 2 e 5): ");
        int n = dado_digitado.nextInt();
        while (n < 2 || n > 5) {
            System.out.println("O valor de n deve estar entre 2 e 5.");
            System.out.print("Digite um valor para n (entre 2 e 5): ");
            n = dado_digitado.nextInt();
        }

        // Figura 1
        System.out.println("\nFigura 1:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Figura 2
        System.out.println("\nFigura 2:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Figura 3
        System.out.println("\nFigura 3:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Figura 4
        System.out.println("\nFigura 4:");
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
