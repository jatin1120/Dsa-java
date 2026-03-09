public class Dsa1_largest{
  public static void main(String[] args) {
        int arr[] = { 20, 10, 30, 40, 100 };
        Largest_ele(arr);
    }

    public static void Largest_ele(int arr[]) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element is : " + largest);
    }
}
