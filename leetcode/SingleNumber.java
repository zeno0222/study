import java.util.Arrays;
import java.util.HashMap;

/**
 * 136. Single Number
 * easy
 * 2022. 02. 15 tuesday
 * array, bit manipulation
 */


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};    // 1
        int[] nums2 = {4,1,2,1, 2,3,3,5,4}; // 4
        int[] nums3 = {1};          // 1

        System.out.println("singleNum = " + singleNumber3(nums2));
    }


    //Runtime: 1 ms, faster than 95.92% of Java online submissions for Single Number.
    //Memory Usage: 49.8 MB, less than 37.42% of Java online submissions for Single Number.
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }

    //Runtime: 11 ms, faster than 26.97% of Java online submissions for Single Number.
    //Memory Usage: 50.3 MB, less than 34.10% of Java online submissions for Single Number.
    public static int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1)
            return nums[0];
        for(int i = 0; i < nums.length - 1; i+=2){
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }

    //Runtime: 23 ms, faster than 13.90% of Java online submissions for Single Number.
    //Memory Usage: 54.6 MB, less than 5.21% of Java online submissions for Single Number.
    public static int singleNumber3(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        for(int ans : map.keySet()){
            if(map.get(ans) == 1)
                return ans;
        }
        return 0;
    }


}
