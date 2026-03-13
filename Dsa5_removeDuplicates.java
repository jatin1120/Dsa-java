public class Dsa_practice {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 10, 30, 40, 20 };
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int arr[]) {

        int newarr[] = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            int flag = 0;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                newarr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
