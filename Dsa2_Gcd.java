public class Dsa_practice {
    public static void main(String[] args) {
        findGcd(12, 18);
    }

    public static void findGcd(int a, int b) {
        int gcd = 0;

        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("Gcd is : " + gcd);

    }
}


