import java.util.Scanner;

public class RectangleAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double width = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double length = scanner.nextDouble();

        double area = width * length;
        double perimeter = 2 * (width + length);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimeter);

    }

}
