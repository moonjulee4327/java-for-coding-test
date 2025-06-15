package implement;

public class UpDownLeftRight {
    public static void main(String[] args) {
        System.out.println(solution(5, "R R R  U D D"));
    }

    private static String solution(int n, String plan) {
        int x = 1;
        int y = 1;
        String[] commands = plan.split(" ");

        for(int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "U":
                    if(x <= 1) {
                        continue;
                    }else {
                        x -= 1;
                    }
                    break;
                case "D":
                    if (x > n) {
                        continue;
                    }else {
                        x += 1;
                    }
                    break;
                case "R":
                    if(y > n) {
                        continue;
                    }else {
                        y += 1;
                    }
                    break;
                case "L":
                    if(y <=1) {
                        continue;
                    }else {
                        y -= 1;
                    }
                    break;
            }
        }

        return x + " " + y;
    }
}
