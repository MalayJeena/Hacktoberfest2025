// max consecutive ones
// contributor - malay jeena

package SlidingWindow;
import java.util.*;

public class MaxConsOnesIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(solve1(arr, k));
        }
    }

    private static int solve1(int[] nums, int k) {
        int l = 0, r = 0, maxLen = 0;

        while (r < nums.length) {

            if (nums[r] == 0) {
                if (k != 0) {
                    k--;
                }else {
                    if (nums[l] == 0) {
                        k++;
                    }
                    l++;
                    continue;
                }
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
