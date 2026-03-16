public class Dsa_practice {
    public static void main(String[] args) {
        isArmstrong(153);
    }

    public static void isArmstrong(int num) {
        int ori = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == ori) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }
    }
}
