public class SumArguments {

    public static void main(String[] args) {

        double sum = 0;

        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                // Ignora argumentos inválidos
            }
        }

        System.out.println("Soma dos argumentos válidos: " + sum);

    }

}
