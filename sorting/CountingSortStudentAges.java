import java.util.Arrays;

public class CountingSortStudentAges {
    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        for (int num : arr) count[num - min]++;
        for (int i = 1; i < range; i++) count[i] += count[i - 1];
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14, 12, 17, 11};
        System.out.println("Before: " + Arrays.toString(ages));
        countingSort(ages, 10, 18);
        System.out.println("After:  " + Arrays.toString(ages));
    }
}
