import java.util.Arrays;

/**
 * 153. Find Minimum in Rotated Sorted Array
 * 2022. 02. 17 목요일
 *
 */

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,1,2,3};
        System.out.println("findMin(nums) = " + findMin4(nums));
    }

    //Runtime: 2 ms, faster than 32.46% of Java online submissions for Find Minimum in Rotated Sorted Array.
    //Memory Usage: 43.1 MB, less than 6.60% of Java online submissions for Find Minimum in Rotated Sorted Array.
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
    //Memory Usage: 43.6 MB, less than 6.60% of Java online submissions for Find Minimum in Rotated Sorted Array.
    public static int findMin2(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] < nums[i])
                return nums[i+1];
        }
        return 0;
    }

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
    //Memory Usage: 42.3 MB, less than 23.73% of Java online submissions for Find Minimum in Rotated Sorted Array.
    public static int findMin3(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int mid = (l + r) / 2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return nums[r];
    }

    public static int findMin4(int[] num) {
        int low = 0;
        int high = num.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(num[high] < num[mid]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return num[high];
    }

}
