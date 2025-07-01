package dfsbfs;

import java.util.ArrayList;

public class MyDfs {
    private static boolean[] visited = new boolean[11];
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 0; i < 11; i++) {
            graph.add(new ArrayList<Integer>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(4);
        graph.get(2).add(10);

        graph.get(3).add(1);
        graph.get(3).add(5);
        graph.get(3).add(8);
        graph.get(3).add(10);

        graph.get(4).add(2);
        graph.get(4).add(6);
        graph.get(4).add(7);

        graph.get(5).add(3);
        graph.get(5).add(8);

        graph.get(6).add(4);
        graph.get(6).add(7);

        graph.get(7).add(9);
        graph.get(7).add(10);

        graph.get(8).add(1);
        graph.get(8).add(3);
        graph.get(8).add(5);

        graph.get(9).add(7);
        graph.get(9).add(8);

        graph.get(10).add(2);
        graph.get(10).add(3);
        graph.get(10).add(7);

        dfs(1);
    }

    private static void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for(int i = 0; i < graph.get(start).size(); i++) {
            int x = graph.get(start).get(i);
            if(!visited[x]) {
                dfs(x);
            }
        }
    }
}
