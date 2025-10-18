package Interview150;

import java.util.ArrayList;
import java.util.List;

public class Main2025_05_07_01_02 {
    boolean res = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        int[] visited = new int[numCourses];
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        for (int i = 0; i < numCourses && res; i++) {
            if(visited[i] == 0){
                dfs(i, visited, edges);
            }
        }
        return res;
    }

    private void dfs(int i, int[] visited, List<List<Integer>> edges) {
        visited[i] = 1;
        List<Integer> list = edges.get(i);
        for(int j : list){
            if(visited[j] == 0){
                dfs(j, visited, edges);
                if(!res){
                    return;
                }
            } else if (visited[j] == 1) {
                res = false;
                return;
            }
        }
        visited[i] = 2;
    }
}
