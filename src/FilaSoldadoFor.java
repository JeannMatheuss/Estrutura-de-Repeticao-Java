import java.util.*;
public class FilaSoldadoFor {
    public static void main(String[] args) {

        int quantidade_soldados, i, j;
        Scanner dado_digitado = new Scanner (System.in);

        System.out.println("Digite a quantidade de soldados: ");
        quantidade_soldados = dado_digitado.nextInt();

        for (i = 1; i <= quantidade_soldados; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
