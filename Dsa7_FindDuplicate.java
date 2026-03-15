public class Dsa_practice {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 20, 40 };
        int ans = findDuplicate(arr);
        if (ans == -1) {
            System.out.println("There is no duplicate number in array");
        } else {
            System.out.println("Duplicate number is : " + ans);
        }
    }

    public static int findDuplicate(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {

                    return arr[i];
                }
            }
        }
        return -1;
    }
}
