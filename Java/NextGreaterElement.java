// next greater element
// contributor - malay jeena

package Stack_Queue;
import java.util.*;

public class nextGreaterEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
//            System.out.println(Arrays.toString(solve1(arr)));
            System.out.println(Arrays.toString(solve2(arr)));
        }
    }

    private static int[] solve1(int[] arr) {
        int[] res = new int[arr.length];

        a:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    continue a;
                }
            }
            res[i] = -1;

        }
        return res;
    }

    private static int[] solve2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        res[arr.length - 1] = -1;
        stack.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
}
