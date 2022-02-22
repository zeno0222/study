import java.net.Inet4Address;
import java.util.*;


/**
 * 567. Permutation in String
 * 2020. 2. 11 Fri
 */
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "eidbaooo";
        System.out.println("checkInclusion(s1, s2) = " + checkInclusion(s1, s2));

        String s3 = "abc";
        String s4 = "bbbca";
        System.out.println("checkInclusion(s3, s4) = " + checkInclusion(s3, s4));

        String s5 = "ab";
        String s6 = "ab";
        System.out.println("checkInclusion(s5, s6) = " + checkInclusion(s5, s6));

    }

    public static boolean checkInclusion(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(Character c = 'a'; c < 'z'; c++){
            map.put(c.charValue(), 0);
            map2.put(c.charValue(), 0);
        }
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        String s3 = s2.substring(0, s1.length());
        for(int i = 0; i < s3.length(); i++){
            map2.put(s3.charAt(i), map2.getOrDefault(s3.charAt(i), 0) + 1);
        }

        for(int i = 0; i < s2.length() - s1.length(); i++){
            if(map2.equals(map)){
                return true;
            }
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) - 1);
            map2.put(s2.charAt(i + s1.length()), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        return false;
    }
}

//Runtime: 1745 ms, faster than 5.00% of Java online submissions for Permutation in String.
//Memory Usage: 294 MB, less than 5.01% of Java online submissions for Permutation in String.