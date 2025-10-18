package Interview150;

import java.util.ArrayList;
import java.util.List;

public class Main2025_05_07_02_01 {
    int[] res = null;
    int a = 0;
    boolean re = true;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        res = new int[numCourses];
        a = numCourses - 1;
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        int[] visited = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            edges.get(prerequisite[1]).add(prerequisite[0]);
        }
        for (int i = 0; i < numCourses && re; i++) {
            if(visited[i] == 0){
                dfs(i, visited, edges, res);
            }
        }
        return re ? res : new int[0];
    }

    private void dfs(int i, int[] visited, List<List<Integer>> edges, int[] res) {
        visited[i] = 1;
        List<Integer> list = edges.get(i);
        for(int j : list){
            if(visited[j] == 0){
                dfs(j, visited, edges, res);
                if(!re){
                    return;
                }
            } else if (visited[j] == 1) {
                re = false;
                return;
            }
        }
        visited[i] = 2;
        res[a] = i;
        i--;
    }
}
