import java.util.*;

class Solution {

    public static void findZeroSumSubarrays(int[] arr) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        map.put(0, new ArrayList<>());

        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum)) {

                for (int start : map.get(sum)) {

                    System.out.println(
                        "Subarray: " + (start + 1) + " to " + i
                    );
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());

            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, -3, 3, -1, -2};

        findZeroSumSubarrays(arr);
    }
}
