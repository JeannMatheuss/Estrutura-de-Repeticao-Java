import java.util.Scanner;

public class SomatorioFor {
    public static void main(String[] args) {
        int a, b, somatorio;

        Scanner valor_digitado = new Scanner(System.in);

        System.out.println("Digite um número (a): ");
        a = valor_digitado.nextInt();

        System.out.println("Digite outro número (b): ");
        b = valor_digitado.nextInt();

        somatorio = 0;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                somatorio += (a * b) + Math.pow((j + i), 2);
            }
        }

        System.out.println("O resultado do somatório é: " + somatorio);

        valor_digitado.close();
    }
}
