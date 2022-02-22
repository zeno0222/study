// 560. Subarray Sum Equals K

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = new int[]{1, -1, 0};
        int k = 0;
        System.out.println("subarraySum(nums) = " + subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int cnt = 0;
        if(nums.length == 1 && nums[0] == k) {
            System.out.println("nums.length = " + nums.length);
            return 1;
        }
        
        for(int i = 0; i < nums.length; i++){
            int tmpSum = nums[i];
            if(tmpSum == k){
                cnt++;
                System.out.println(nums[i]);
                continue;
            }
            for(int j = i+1; j < nums.length; j++){
                tmpSum += nums[j];
                if(tmpSum == k){
                    System.out.println(nums[i] + " , "+ nums[j]);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

//Runtime: 850 ms, faster than 19.88% of Java online submissions for Subarray Sum Equals K.
//Memory Usage: 45.1 MB, less than 62.30% of Java online submissions for Subarray Sum Equals K.