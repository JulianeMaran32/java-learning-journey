import java.util.Scanner;

public class ReadValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        System.out.print("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número real: " + numeroReal);

        scanner.close();

    }

}
