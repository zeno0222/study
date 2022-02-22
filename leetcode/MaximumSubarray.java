import java.time.Instant;

public class MaximumSubarray {

//    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//    Output: 6
//    Explanation: [4,-1,2,1] has the largest sum = 6.

    /**
     *  2022. 02. 15 화요일
     *  53. Maximum Subarray
     */

    public static void main(String[] args) {
        int[] nums = {2,-1, -2, 4,-1,7,8};
        int res = maxSubArray2(nums);
        System.out.println("res = " + res);
    }

    // 	Time Limit Exceeded
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for(int i = 0; i < nums.length; i++){
            int tmpSum = 0;
            for(int j = i; j < nums.length; j++){
                tmpSum += nums[j];
                if(tmpSum > maxSum){
                    maxSum = tmpSum;
                }
            }
        }
        return maxSum;
    }
//    Runtime: 1397 ms, faster than 5.72% of Java online submissions for Maximum Subarray.
//    Memory Usage: 125.5 MB, less than 6.17% of Java online submissions for Maximum Subarray.
    public static int maxSubArray2(int[] nums) {
        int curMax = nums[0];
        int allMax = nums[0];
        for(int i = 1; i < nums.length; i++){
            curMax = Math.max(nums[i], curMax + nums[i]);
            allMax = Math.max(allMax, curMax);
            System.out.println("curMax = " + curMax + "  allMax = " + allMax);
        }
        return allMax;
    }


}
