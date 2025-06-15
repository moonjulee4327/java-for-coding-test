package implement;

public class HourMinuteSecond {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }

    private static int solution(int n) {
        int result = 0;
        String time = "";
        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if((time + i + j + k).contains("3")) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
