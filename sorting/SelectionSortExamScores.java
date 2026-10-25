import java.util.Arrays;

public class SelectionSortExamScores {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {88, 55, 92, 70, 65, 99};
        System.out.println("Before: " + Arrays.toString(scores));
        selectionSort(scores);
        System.out.println("After:  " + Arrays.toString(scores));
    }
}
