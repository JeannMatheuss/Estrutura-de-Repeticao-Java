import java.util.Scanner;

public class SomatorioWhile {
    public static void main(String[] args) {
        int a, b, somatorio;

        Scanner valor_digitado = new Scanner(System.in);

        System.out.println("Digite um número (a): ");
        a = valor_digitado.nextInt();

        System.out.println("Digite outro número (b): ");
        b = valor_digitado.nextInt();

        somatorio = 0;
        int i = 1;

        while (i <= a) { // Laço externo para i
            int j = 1;   // Reinicia j a cada iteração de i
            while (j <= b) { // Laço interno para j
                somatorio += (a * b) + ((j + i) * (j + i)); // Calcula o somatório
                j++; // Incrementa j
            }
            i++; // Incrementa i
        }

        System.out.println("O resultado do somatório é: " + somatorio);
        valor_digitado.close();
    }
}
