public class ContinueLoop {
    public static void main(String[] args) {

        // Usando continue para pular números pares
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue; // Pula pares
            }

            System.out.println(i);
        }

    }
}
