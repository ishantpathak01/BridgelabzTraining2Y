import java.util.Arrays;

public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {85, 42, 78, 95, 60, 73};
        System.out.println("Before: " + Arrays.toString(marks));
        bubbleSort(marks);
        System.out.println("After:  " + Arrays.toString(marks));
    }
}
