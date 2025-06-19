package implement;

public class Knight {
    public static void main(String[] args) {
        System.out.println(solution("a1"));
    }

    private static int solution(String position) {
        String[] pArr = position.split("");
        int row = Integer.parseInt(pArr[1]);
        int coulumn = pArr[0].charAt(0) - 'a' + 1;

        int[][] steps = {
                {2, -1}, {2, 1},
                {1, 2}, {-1, 2},
                {-2, 1}, {-2, -1},
                {-1, -2}, {1, -2}
        };

        int result = 0;
        for(int[] step : steps) {
            int nextRow = row + step[0];
            int nextCoulumn = coulumn + step[1];
            if(nextRow >= 1 && nextRow <= 8 && nextCoulumn >= 1 && nextCoulumn <= 8) {
                result++;
            }
        }

        return result;
    }
}
