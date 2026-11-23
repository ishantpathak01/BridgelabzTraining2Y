import java.util.*;

class SlidingWindow{

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        if (k <= 0 || k > n) {
            return new int[0];
        }

        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!dq.isEmpty() &&
                   dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() &&
                   nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        System.out.println(
            Arrays.toString(maxSlidingWindow(nums, k))
        );
    }
}
