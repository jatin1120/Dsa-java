public class que_1 {
    public static void main(String[] args) {
        int num = 54345;
        ispalin(num);
    }

    public static void ispalin(int num){
        int org = num ;
        int rev = 0;
        
        while(num > 0){
            int dig = num % 10;
            rev = rev * 10 + dig ;
            num = num /10;
        }

        if (org == rev ){
            System.out.println("This number is palindrome");
        }
        else{
            System.out.println("this number is not palindrome");
        }

    }
}
