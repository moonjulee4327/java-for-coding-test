package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameDevelop {
    // 북, 동, 남, 서
    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static int[][] map = new int[50][50];
    private static int[][] visited = new int[50][50];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm = br.readLine();
        String[] nmArr = nm.split("");
        int n = Integer.parseInt(nmArr[0]);
        String[] position = br.readLine().split(" ");
        int x = Integer.parseInt(position[0]);
        int y = Integer.parseInt(position[1]);
        int direction = Integer.parseInt(position[2]);

        for(int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }

        System.out.println(move(x, y, direction, map));
    }

    private static int move(int x, int y, int direction, int[][] map) {
        int count = 1;
        int terns = 0;
        while (true) {
            // 왼쪽 방향으로 회전
            direction--;
            if(direction == -1) {
                direction = 3;
            }

            // 이동 할 칸 확인 후 이동
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if(map[nx][ny] == 0 && visited[nx][ny] == 0) {
                x = nx;
                y = ny;
                visited[x][y] = 1;
                count++;
                continue;
            }else { // 바다이거나 가본 경우
                terns++;
            }

            // 네 방향을 갈 수 없는 경우
            if(terns == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];
                // 뒤로 이동
                if(map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }else {
                    break;
                }
                terns = 0;
            }
        }

        return count;
    }
}
