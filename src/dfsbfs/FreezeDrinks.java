package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FreezeDrinks {
    private static int n, m;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            String[] line = br.readLine().split("");
            for(int j = 0; j < m; j++) {
                graph.get(i).add(Integer.parseInt(line[j]));
            }
        }

        for(ArrayList<Integer> arr : graph) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        int result = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(dfs(i, j)) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

    private static boolean dfs(int x, int y) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
        if(graph.get(x).get(y) == 0) {
            graph.get(x).set(y, 1);
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}
