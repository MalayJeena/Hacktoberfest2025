// asteroid collision
package Stack_Queue;
import java.util.*;

public class asteroidCollision {
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

    private static int[] solve1(int[] asteroids) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack1.push(asteroids[i]);
            }else {
                stack2.push(asteroids[i]);
            }
        }
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (Math.abs(stack1.peek()) > Math.abs(stack2.peek())) {
                stack2.pop();
            }else if (Math.abs(stack1.peek()) < Math.abs(stack2.peek())) {
                stack1.pop();
            }else {
                stack1.pop();
                stack2.pop();
            }
        }
        if (stack1.isEmpty()) {
            int[] res = new int[stack2.size()];
            Stack<Integer> stack3 = new Stack<>();
            for (int i = 0; i < res.length; i++) {
                stack3.push(stack2.pop());
            }
            for (int i = 0; i < res.length; i++) {
                res[i] = stack3.pop();
            }
            return res;
        }else {
            int[] res = new int[stack1.size()];
            Stack<Integer> stack3 = new Stack<>();
            for (int i = 0; i < res.length; i++) {
                stack3.push(stack1.pop());
            }
            for (int i = 0; i < res.length; i++) {
                res[i] = stack3.pop();
            }
            return res;
        }
    }
