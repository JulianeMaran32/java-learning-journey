import java.util.Scanner;

public class CalculateInvestmentMonths {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do depósito mensal: ");
        double deposit = scanner.nextDouble();

        System.out.print("Montante desejado: ");
        double target = scanner.nextDouble();

        double total = 0;
        int months = 0;

        while (total < target) {
            total += deposit;
            total *= 1.005; // juros de 0,5%
            months++;
        }

        System.out.println("Meses necessários: " + months);

        scanner.close();

    }

}
