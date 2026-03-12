public class Dsa_practice {
    public static void main(String[] args) {
        cheakprime(7);
    }

    public static void cheakprime(int n) {
        if (n <= 1) {
            System.out.println("This number is not prime");
            return;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("This number is not prime");
                return;
            }
        }
        System.out.println("This number is prime");
    }
}
