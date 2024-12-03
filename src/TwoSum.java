public class TwoSum {

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.
//
//    Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int firstNumber = 0; firstNumber < nums.length - 1; firstNumber++) {
            result[0] = firstNumber;
            for (int secondNumber = nums.length - 1; secondNumber > firstNumber; secondNumber--) {
                if (nums[firstNumber] + nums[secondNumber] == target) {
                    result[1] = secondNumber;
                    return result;
                }
            }
        }
        return result;
    }


    //================================================Run===================================================//

    public static void main(final String[] args) {
        int[] nums = {3, 3};

        int[] result = TwoSum.twoSum(nums, 6);
        System.out.println(result[0] + "\n" + result[1]);
    }
}
