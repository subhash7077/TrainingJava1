package training.java.Arrayex;

public class ReverseArray {
    void reverseArray(int[] arr) {


        int count = 0;
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
            count++;
        }
    }

    public static void main(String[] args) {
        ReverseArray rev = new ReverseArray();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        rev.reverseArray(arr);
        System.out.println("\nReversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
