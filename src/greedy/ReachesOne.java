package greedy;

public class ReachesOne {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{25, 3}));
    }

    private static int solution(int[] arr) {
        int result = 0;

        while (true) {
            if(arr[0] == 1) {
                break;
            }

            if(arr[0] % arr[1] != 0) {
                arr[0]--;
            }else {
                arr[0] = arr[0] / arr[1];
            }
            result++;
        }

        return result;
    }
}
