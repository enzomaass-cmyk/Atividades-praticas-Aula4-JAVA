public class BreakLoop {
    public static void main(String[] args) {

        // Usando break para parar o loop
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break; // Sai do loop
            }

            System.out.println(i);
        }

    }
}
