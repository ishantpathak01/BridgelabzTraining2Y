import java.util.*;

class PairSum{

    public static boolean hasPair(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            int complement = target - num;

            if (set.contains(complement)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        int target = 9;

        System.out.println(hasPair(arr, target));
    }
}
