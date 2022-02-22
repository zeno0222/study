import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int sol = findPairs(new int[]{3,1,4,1,5},2);
        System.out.println("sol = " + sol);
    }

    public static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(k == 0){
                if(entry.getValue() >= 2){
                    cnt++;
                }
            }
            else if(map.containsKey(entry.getKey() - k)){
                cnt++;
            }
        }

        return cnt;
    }
}
