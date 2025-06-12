package greedy;

public class ReachesOne {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{25, 3}));
    }

    private static int solution(int[] arr) {
        int result = 0;

        // 무조건 arr[0]을 arr[1]로 나누는 것이 arr[0] 숫자를 줄이는 최선의 방식이다.
        while (arr[0] >= arr[1]) {
            // arr[0]이 arr[1]로 나눠 떨어지지 않으면 1씩 감소시켜 나누어 떨어지는 수로 만든다.
            while (arr[0] % arr[1] != 0) {
                arr[0]--;
                result++;
            }
            arr[0] /= arr[1];
            result++;
        }

        // 마지막에 arr[1]보다 작고 1보다 클 경우 1씩 감소 시켜준다.
        while (arr[0] > 1) {
            arr[0]--;
            result++;
        }

        return result;
    }
}
