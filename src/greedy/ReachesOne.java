package greedy;

public class ReachesOne {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{25, 3}));
    }

    private static int solution(int[] arr) {
        int result = 0;
        int target = 0;
        while (true) {
            target = (arr[0] / arr[1]) * arr[1];
            result += arr[0] - target;

            arr[0] = target;
            if(arr[0] < arr[1]) {
                break;
            }

            arr[0] /= arr[1];
            result++;
        }
        result += arr[0] - 1;

        return result;
    }
}
