public class LinearSearchFirstNegative {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 8, 3, -2, 7, -9};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println("Index in arr1: " + findFirstNegative(arr1));
        System.out.println("Index in arr2: " + findFirstNegative(arr2));
    }
}
