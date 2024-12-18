import java.util.*;
public class ExpressaoR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leitura do valor de n
        int n;
        while (true) {
            System.out.print("Digite um valor inteiro, numérico e ímpar para n: ");
            n = sc.nextInt();
            if (n > 0 && n % 2 != 0) {
                break;
            } else {
                System.out.println("O valor de n deve ser um número inteiro positivo e ímpar.");
            }
        }

        // Cálculo da expressão
        double resultado = 0.0;
        for (int i = 1; i <= n; i++) {
            double termo = (double) i / (n - i + 1);
            if (i % 2 == 0) {
                termo = -termo; // Alterna o sinal
            }
            resultado += termo;
        }

        // Impressão do resultado
        System.out.printf("O resultado da expressão é: %.4f\n", resultado);

    }
}
