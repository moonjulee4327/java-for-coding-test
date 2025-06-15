package implement;

public class UpDownLeftRight {
    public static void main(String[] args) {
        System.out.println(solution(5, "R R R U D D"));
    }

    private static String solution(int n, String plans) {
        int x = 1, y = 1;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        String[] direction = {"U", "D", "L", "R"};
        String[] commands = plans.split(" ");

        for(String command : commands) {
            int tempX = x, tempY = y;
            boolean isValid = false;
            for(int i = 0; i < direction.length; i++) {
                if(command.equals(direction[i])) {
                    tempX = dx[i] + x;
                    tempY = dy[i] + y;
                    isValid = true;
                    break;
                }
            }
            // 잘못된 명령어 일 경우
            if (!isValid) continue;
            if(tempX > n || tempY > n || tempX < 1 || tempY < 1) {
                continue;
            }
            x = tempX;
            y = tempY;
        }
        return x + " " + y;
    }
}
