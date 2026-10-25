import java.util.Arrays;

public class InsertionSortEmployeeIDs {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {104, 101, 109, 102, 108, 103};
        System.out.println("Before: " + Arrays.toString(ids));
        insertionSort(ids);
        System.out.println("After:  " + Arrays.toString(ids));
    }
}
