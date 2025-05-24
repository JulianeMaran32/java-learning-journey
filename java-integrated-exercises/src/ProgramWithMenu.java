import java.util.Scanner;

public class ProgramWithMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            showMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            System.out.println(); // Espaço para legibilidade

            switch (opcao) {
                case 1:
                    printName();
                    break;
                case 2:
                    readValues(scanner);
                    break;
                case 3:
                    countUpToN(scanner);
                    break;
                case 4:
                    checkEvenOrOdd(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção do menu.");
            }
            System.out.println(); // Espaço para legibilidade

        } while (opcao != 0);

        scanner.close();

    }

    private static void showMenu() {
        System.out.println("========== MENU ==========");
        System.out.println("1 - Imprimir nome no console");
        System.out.println("2 - Ler valores (inteiro e real)");
        System.out.println("3 - Contar de 0 até N");
        System.out.println("4 - Verificar se N é par ou ímpar");
        System.out.println("0 - Sair");
        System.out.println("==========================");
    }

    private static void printName() {
        System.out.println(">>> Impressão de Nome <<<");
        System.out.println("Meu nome é Juh.");
    }

    private static void readValues(Scanner scanner) {
        System.out.println(">>> Leitura de Valores <<<");

        System.out.print("Digite um número inteiro: ");
        int inteiro = scanner.nextInt();

        System.out.print("Digite um número real (double): ");
        double real = scanner.nextDouble();

        System.out.println("Você digitou o número inteiro: " + inteiro);
        System.out.println("Você digitou o número real (double): " + real);
    }

    private static void countUpToN(Scanner scanner) {
        System.out.println(">>> Contagem de 0 até N <<<");

        System.out.print("Digite um valor inteiro N: ");
        int n = scanner.nextInt();

        System.out.println("Contagem de 0 até " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

    }

    private static void checkEvenOrOdd(Scanner scanner) {

        System.out.println(">>> Verificação de Par ou Ímpar <<<");

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número PAR.");
        } else {
            System.out.println(numero + " é um número ÍMPAR.");
        }

    }

}