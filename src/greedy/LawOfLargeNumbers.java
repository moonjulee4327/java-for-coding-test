package greedy;

import java.util.Arrays;

public class LawOfLargeNumbers {
    public static void main(String[] args) {
        System.out.println(lawOfLargeNumbers(5, 8, 3, new int[]{2, 4, 5, 4, 6}));
    }

    private static int lawOfLargeNumbers(int n, int m, int k, int[] arr) {
        int sum = 0;

        Arrays.sort(arr);
        int first = arr[n - 1];
        int second = arr[n - 2];

        int temp = k;
        for(int i = 0; i < m; i++) {
            if(k != 0) {
                sum += first;
                k--;
            }else {
                sum += second;
                k = temp;
            }
        }
        return sum;
    }
}
