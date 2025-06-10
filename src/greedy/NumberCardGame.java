package greedy;

import java.util.Arrays;

public class NumberCardGame {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{3, 1, 2}, {4, 1, 4}, {2, 2, 2}}));
    }

    private static int solution(int[][] cards) {
        int max = 0;

        for(int[] card : cards) {
            Arrays.sort(card);
            if(card[0] > max) {
                max = card[0];
            }
        }

        return max;
    }
}
