public class Star {
    public static void main(String[] args) {
        int line = 5;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < 2 * line - 1; j++) {
                if (j >= (2 * line - 1) / 2 - i && j <= (2 * line - 1) / 2 + i) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
