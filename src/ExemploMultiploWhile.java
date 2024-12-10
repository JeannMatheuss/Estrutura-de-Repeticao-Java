import java.util.*;
public class ExemploMultiploWhile {
    public static void main(String[] args) {
        int numero, soma, multiplo, i;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um nuemro: ");
        numero = entrada.nextInt();
        System.out.println("\nValor lido: "+numero);
        System.out.println("\nLista de Multiplos: ");
        soma=0;
        i=1;
        while (i <= 10) {
            multiplo = numero * i;
            System.out.println(" "+multiplo);
            soma+=multiplo;
            i++;
        }
        System.out.println("\nSoma dos Multiplos: "+soma);
    }
}
