import java.util.HashMap;

public class SubarraySumEqualsK2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, -1, 0};
        int k = 0;
        System.out.println("subarraySum(nums) = " + subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int cnt = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){

        }

        return cnt;
    }
}
