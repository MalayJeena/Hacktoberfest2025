// airport management
// contributor - malay999
package mar10_mar16.Arrays;

import java.util.Scanner;

public class ariportManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] d = new int[n];
            int[] freq = new int[1440];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq[a[i]]++;
            }
            for (int i = 0; i < n; i++) {
                d[i] = sc.nextInt();
                freq[d[i]]++;
            }
            System.out.println(solve1(freq));
        }
    }

    public static int solve1(int[] freq){

        int runway = 0;
        int max = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }
        runway = max;
        return runway;
    }
}
