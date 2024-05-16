public class Q1 {
    public static void main(String[] args) {
        int n = 5;

        // Upper part
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
