import java.util.Scanner;

public class ReadIntegerAndDouble {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int inteiro = scanner.nextInt();

        System.out.print("Digite um número real (double): ");
        double real = scanner.nextInt();

        System.out.println("Número inteiro: " + inteiro);
        System.out.println("Número real (double): " + real);

        scanner.close();

    }

}
