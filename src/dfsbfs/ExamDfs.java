package dfsbfs;

public class ExamDfs {
    public static void main(String[] args) {
        int[][] graph = {
                {},
                {2, 3, 8},
                {1, 7},
                {1, 4, 5},
                {3, 5},
                {3, 4},
                {7},
                {2, 6, 8},
                {1, 7}
        };

        boolean[] visited = new boolean[graph.length];
        dfs(graph, 1, visited);
    }

    private static void dfs(int[][] graph, int num, boolean[] visited) {
        visited[num] = true;
        System.out.print(num + " ");
        for(int i = 0; i < graph[num].length; i++) {
            int next = graph[num][i];
            if(!visited[next]) {
                dfs(graph, next, visited);
            }
        }
    }
}
