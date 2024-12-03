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
//
//        Example 2:
//
//        Input: nums = []
//        Output: []
//
//        Example 3:
//
//        Input: nums = [0]
//        Output: []
//
//        Example 4:
//
//        Input: nums = [0,0,0]
//        Output: [0,0,0]

class ThreeSumSolution {

    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3)
            return emptyList()

        val sumMap = mutableMapOf<Int, List<Int>>()
        for (i in nums.indices) {
            val oneSum = nums[i]
            for (j in i + 1 until nums.size) {
                val twoSum = oneSum + nums[j]
                for (k in j + 1 until nums.size) {
                    if (twoSum + nums[k] == 0) {
                        val key = Math.abs(nums[k]) + Math.abs(nums[j]) + Math.abs(nums[i])
                        sumMap[key] = mutableListOf(nums[i], nums[j], nums[k])
                    }
                }
            }
        }
        return sumMap.values.toList()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = ThreeSumSolution()
            val input = intArrayOf(-1, 0, 1, 2, -1, -4)
            println(solution.threeSum(input))
        }
    }
}