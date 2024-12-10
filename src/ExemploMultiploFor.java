import java.util.*;
public class ExemploMultiploFor {
    public static void main(String[] args) {
        int numero, soma, multiplo, i;

        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        System.out.println("\nValor Lido: "+numero);
        System.out.println("\nLista de Multiplos: ");
        soma = 0;
        for (i = 1; i<=10; i++) {
            multiplo = numero * i;
            System.out.println(" " + multiplo);
            soma+=multiplo;
        }
        System.out.println("\nSoma = "+soma);
    }
}
