import java.util.HashMap;
import java.util.Map;

// 217. Contains Duplicate

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,4};
        System.out.println("containsDuplicate(nums) = " + containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() >= 2){
                return true;
            }
        }
        return false;
    }
}

// Runtime: 22 ms, faster than 24.92% of Java online submissions for Contains Duplicate.
// Memory Usage: 50 MB, less than 96.09% of Java online submissions for Contains Duplicate.