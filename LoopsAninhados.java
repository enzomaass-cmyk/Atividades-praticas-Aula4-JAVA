public class LoopsAninhados {
    public static void main(String[] args) {

        // Loops aninhados para criar o padrão
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "-" + j + " ");
            }

            System.out.println(); // Quebra de linha
        }

    }
}
