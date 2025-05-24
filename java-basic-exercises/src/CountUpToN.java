import java.util.Scanner;

public class CountUpToN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro N: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        scanner.close();

    }

}
