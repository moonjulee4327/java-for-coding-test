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

        // 큰 수가 반복되는 횟수 구하기
        int count = (m / (k + 1)) * k;
        // 반복하는 동안 더해지는 큰 수 구하기
        sum += count * first;
        // 반복 후 나머지 더해지는 큰 수 구하기
        sum += m % (k + 1) * first;

        // 반복되는 만큼 두 번째로 큰 수 더하기
        sum += (m - count) * second;

        return sum;
    }
}
