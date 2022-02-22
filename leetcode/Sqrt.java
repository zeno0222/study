public class Sqrt {
    public static void main(String[] args) {
        System.out.println("mySqrt(23) = " + mySqrt(2147395599));
    }

// Runtime: 2 ms, faster than 69.18% of Java online submissions for Sqrt(x).
// Memory Usage: 42.5 MB, less than 5.05% of Java online submissions for Sqrt(x).
    public static int mySqrt(int x) {
        if(x <= 1)
            return x;
        int l = 1;
        int r = x/2;
        int mid = (l+r)/2;
        while(l < r){
            mid = (l+r)/2;
            if(mid <= x/mid && (mid+1) > x/(mid+1)){
                return mid;
            }else if(mid < x/mid){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return r;
    }

//Runtime: 2 ms, faster than 69.18% of Java online submissions for Sqrt(x).
//Memory Usage: 41.3 MB, less than 20.33% of Java online submissions for Sqrt(x).
    public static int mySqrt2(int x) {
        if(x <= 0) return 0;
        int l = 1, r = x, res = 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(mid > x/mid) {
                r = mid;
            } else {
                res = mid;
                l = mid + 1;
            }
        }
        return res;
    }
}
