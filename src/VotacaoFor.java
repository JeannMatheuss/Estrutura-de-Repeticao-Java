import java.util.Scanner;
public class VotacaoFor {
    public static void main(String[] args) {

        int votoCandidatoJoao = 0, votoCandidatoMaria = 0, votoBranco = 0, votoNulo = 0;

        Scanner dado_digitado = new Scanner(System.in);
        System.out.println("Digite a quantidade de eleitores esperados: ");
        int eleitores_esperados = dado_digitado.nextInt();

        System.out.println("Tabela para a Eleição Municipal");
        System.out.println("-------------------------------");
        System.out.println("João - Código 11");
        System.out.println("Maria - Código 45");
        System.out.println("Voto em Branco - Código 0");
        System.out.println("Voto nulo - Outros Códigos");
        System.out.println("-------------------------------");

        for (int i = 1;; i++) {
            System.out.println("Vote no seu candidato: ");
            int voto = dado_digitado.nextInt();

            if (voto == 11) {
                votoCandidatoJoao++;
            } else if (voto == 45) {
                votoCandidatoMaria++;
            } else if (voto == 0) {
                votoBranco++;
            } else {
                votoNulo++;
            }

            if (voto == -12345) {
                System.out.println("Deseja finalizar a votação? (sim/não)");
                String resposta = dado_digitado.next();

                if (resposta.equalsIgnoreCase("sim")) {
                    System.out.println("Digite a senha de confirmação para finalizar a votação:");
                    int senha = dado_digitado.nextInt();

                    if (senha == -35719) {
                        System.out.println("Votação finalizada com sucesso!");
                        break;
                    } else {
                        System.out.println("Senha incorreta! A votação continuará.");
                    }
                }
            }
        }

        System.out.println("\nResultado da votação: ");
        System.out.println("Numero de eleitores esperados: " + eleitores_esperados);
        System.out.println("Candidato João: " + votoCandidatoJoao + " votos");
        System.out.println("Candidata Maria: " + votoCandidatoMaria + " votos");
        System.out.println("Votos em Branco: " + votoBranco);
        System.out.println("Votos nulos: " + votoNulo);

        dado_digitado.close();
    }
}
