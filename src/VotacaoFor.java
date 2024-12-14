import java.util.*;
public class VotacaoFor {
    public static void main(String[] args) {
        
        Scanner dado_digitado = new Scanner(System.in);
        System.out.println("Digite a quantidade de eleitores: ");
        int eleitores = dado_digitado.nextInt();

        System.out.println("Tabela para a Eleição Municipal");
        System.out.println("-------------------------------");
        System.out.println("João - Código 11");
        System.out.println("Maria - Código 45");
        System.out.println("Voto em Branco - Código 0");
        System.out.println("Voto nulo - Outros Códigos");
        System.out.println("-------------------------------");


        for (int i = 1; i <= eleitores; i++) {
            System.out.println("Vote no seu candidato: ");
            int voto = dado_digitado.nextInt();

            if (voto == 11) {
                System.out.println("Voto de " + i + "º eleitor foi para João");
            }
            else if (voto == 45) {
                System.out.println("Voto de " + i + "º eleitor foi para Maria");
            }
            else if (voto == 0) {
                System.out.println("Voto de " + i + "º eleitor foi para Branco");
            }
            else {
                System.out.println("Voto de " + i + "º eleitor foi Nulo");
            }
        }
        


    }

}
