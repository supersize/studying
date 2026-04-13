import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.stream.Stream;

public class Test01 {
    // [1,0,1,4,2] 39200
    //-100,-2,-3,1 -600
    public double strStr(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for (int i = 0;i < nums.length; i++) {
            windowSum += nums[i];
            if (i >= k - 1) {
                maxSum = Integer.max(windowSum, maxSum);
                windowSum -= nums[i - (k - 1)];
            }
        }
        

        return maxSum ;
    }
}
