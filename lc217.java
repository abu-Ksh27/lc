import java.util.*;

public class leet217{

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};  // example input
        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return true; // duplicate found
            }
            set.add(n);
        }
        return false;
    }
}

