/**
 * 152. Maximum Product Subarray
 * 2022. 02. 15 화요일
 *
 */




public class MaximumProductSubarray {

//Example 1:
//
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2, -2, 4};
        int[] nums2 = {2, 3, -2, 4, -2};
        int[] nums3 = {1, 2, -2, 3, 4, 5, -1, 3, -100};
        int[] nums4 = {2,3,-2,4,100};
        System.out.println("maxProduct2(nums3) = " + maxProduct2(nums4));
    }

    //Runtime: 241 ms, faster than 5.56% of Java online submissions for Maximum Product Subarray.
    //Memory Usage: 42.4 MB, less than 29.38% of Java online submissions for Maximum Product Subarray.
    public static int maxProduct(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            int aryMax = 1;
            for(int j = i; j < nums.length; j++){
                aryMax *= nums[j];
                if(aryMax > max){
                    max = aryMax;
                }
            }
        }
        return max;
    }

    // 2 3 -2 4 100
    //Runtime: 2 ms, faster than 65.43% of Java online submissions for Maximum Product Subarray.
    //Memory Usage: 45 MB, less than 14.60% of Java online submissions for Maximum Product Subarray.
    public static int maxProduct2(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            int tmp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(tmp * nums[i], min * nums[i]), nums[i]);

            if(max > ans){
                ans = max;
            }
            System.out.println("max , min, ans = " + max + " , " + min + ", " + ans);
        }
        return max;
    }

    //Runtime: 2 ms, faster than 65.43% of Java online submissions for Maximum Product Subarray.
    //Memory Usage: 44.9 MB, less than 17.12% of Java online submissions for Maximum Product Subarray.
    public static int maxProduct3(int[] nums) {
        int len = nums.length;
        int l = 1, r = 1;
        int maxProduct = nums[0];

        for(int i = 0; i < len; i++){
            l = l == 0 ? 1 : l;
            r = r == 0 ? 1 : r;

            l *= nums[i];
            r *= nums[len-1-i];

            maxProduct = Math.max(maxProduct, Math.max(l, r));
        }
        // 3, -1, 3, 100, -1,  5, 4, -2, 3
        return maxProduct;
    }


    public static int maxProduct4(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            // Swapping min and max
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}
