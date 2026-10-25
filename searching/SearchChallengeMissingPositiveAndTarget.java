import java.util.Arrays;

public class SearchChallengeMissingPositiveAndTarget {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        for (int num : nums) {
            if (num > 0 && num <= n) seen[num] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) return i;
        }
        return n + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("First missing positive: " + firstMissingPositive(arr));
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println("Index of 4: " + binarySearch(arr, 4));
        System.out.println("Index of 2: " + binarySearch(arr, 2));
    }
}
