public class Dsa_practice {
    public static void main(String[] args) {
        printDivisor(12);
    }

    public static void printDivisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
