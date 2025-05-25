import java.util.Scanner;

public class CheckEvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " é par.");
        } else {
            System.out.println(number + " é ímpar.");
        }

        scanner.close();

    }

}
