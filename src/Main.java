import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double peso;
        double creatina;
        double proteina;
        double agua;
        int opcao = -1;


        Scanner leitura = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("=== CALCULADORA DE MACROS E SUPLEMENTAÇÂO ===");
            System.out.println("        Digite o que deseja calcular: ");
            System.out.println("    1 - Calcular meta de Proteína diária");
            System.out.println("    2 - Calcular dose de Creatina diária");
            System.out.println("    3 - Calcular a meta de Água diária");
            System.out.println("    0 - Sair do programa");

            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite seu peso: ");
                    peso = leitura.nextDouble();
                    proteina = peso * 2.0;
                    System.out.println("A quantidade de proteínas que você deve consumir é: " + String.format("%.2f", proteina) + "g");
                    break;

                case 2:
                    System.out.println("Digite seu peso: ");
                    peso = leitura.nextDouble();
                    creatina = peso * 0.06;
                    System.out.println("A quantidade de creatina que você deve consumir é: " + String.format("%.2f", creatina) + "g");
                    break;

                case 3:
                    System.out.println("Digite seu peso: ");
                    peso = leitura.nextDouble();
                    agua = peso * 0.04;
                    System.out.println("A quantidade de água que você deve consumir é: " + String.format("%.2f", agua) + "L");
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção Invalida, tente novamente!");
                    break;
            }
        } while (opcao != 0);
        leitura.close();
    }
}