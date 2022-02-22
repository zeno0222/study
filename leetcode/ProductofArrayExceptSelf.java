/**
 * 2022. 02. 14 월
 * 238. Product of Array Except Self
 */

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf3(nums);
        for(int a : ans){
            System.out.print(a + " ");
        }
    }
    // Time Limit Exceeded
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < ans.length; i++){
            ans[i] = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    ans[i] *= ans[j];
                }
            }
        }
        return ans;
    }

    /*
        Runtime: 16 ms, faster than 5.77% of Java online submissions for Product of Array Except Self.
        Memory Usage: 57.8 MB, less than 16.68% of Java online submissions for Product of Array Except Self.
     */
    public static int[] productExceptSelf2(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 1;
        int zeroCnt = 0;
        for(int num : nums){
            if(num == 0){
                zeroCnt++;
            }
            if(num != 0){
                sum *= num;
            }
        }
        System.out.println(zeroCnt + " " + sum);
        if(zeroCnt >= 2){
            for(int i = 0; i < ans.length; i++){
                ans[i] = 0;
            }
        }
        if(zeroCnt == 1){
            for(int i = 0; i < ans.length; i++){
                if(nums[i] == 0){
                    ans[i] = sum;
                }else{
                    ans[i] = 0;
                }
            }
        }
        if(zeroCnt == 0){
            for(int i = 0; i < ans.length; i++) {
                ans[i] = sum / nums[i];
            }
        }
        return ans;
    }
//Runtime: 2 ms, faster than 70.33% of Java online submissions for Product of Array Except Self.
//Memory Usage: 58.1 MB, less than 8.08% of Java online submissions for Product of Array Except Self.
    public static int[] productExceptSelf3(int[] nums) {
        int[] ans = new int[nums.length];

        ans[0] = 1;
        for(int i = 1; i < nums.length; i++){
            ans[i] = nums[i-1] * ans[i-1];
        }
        int tmp = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            tmp *= nums[i+1];
            ans[i] *= tmp;
        }

        return ans;
    }

}

