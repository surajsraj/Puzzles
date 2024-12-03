import java.util.*;

//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//        Notice that the solution set must not contain duplicate triplets.
//
//
//
//        Example 1:
//
//        Input: nums = [-1,0,1,2,-1,-4]
//        Output: [[-1,-1,2],[-1,0,1]]
//        Example 2:
//
//        Input: nums = []
//        Output: []
//        Example 3:
//
//        Input: nums = [0]
//        Output: []

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Map<String, int[]> map = new TreeMap<>();
        List<List<Integer>> output = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                map.put(String.valueOf(nums[i] + nums[j]), new int[]{i, j});
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(String.valueOf(-nums[i]))) {
                int[] value = map.get(String.valueOf(-nums[i]));
                if (value[0] != i && value[1] != i) {
                    output.add(Arrays.asList(nums[i], nums[value[0]], nums[value[1]]));
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(input));
    }

}
