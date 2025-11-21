import java.util.*;
public class leet1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            // If pair found
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            // Store value → index
            map.put(nums[i], i);
        }

        return new int[]{}; // no pair found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]); // Output: 0,1
    }
}
