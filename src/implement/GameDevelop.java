package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GameDevelop {
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int n, m;
    private static int direction;
    private static int[][] map = new int[50][50];
    private static int[][] visited = new int[50][50];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        visited[x][y] = 1;
        direction = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        System.out.println(move(x, y, map));
    }

    private static void turnLeft() {
        direction--;
        if(direction == -1) {
            direction = 3;
        }
    }

    private static int move(int x, int y, int[][] map) {
        int cnt = 1;
        int turns = 0;
        while (true) {
            turnLeft();
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if(map[nx][ny] == 0 && visited[nx][ny] == 0 && nx >= 0 && nx < n && ny >= 0 && ny < m) {
                x = nx;
                y = ny;
                visited[nx][ny] = 1;
                cnt++;
                turns = 0;
                continue;
            }else {
                turns++;
            }

            if(turns == 4 && nx >= 0 && nx < n && ny >= 0 && ny < m) {
                nx = x - dx[direction];
                ny = y - dy[direction];
                if(map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }else {
                    break;
                }
                turns = 0;
            }
        }

        return cnt;
    }
}