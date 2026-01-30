import java.util.ArrayList;
import java.util.List;

public class DFS {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(List.of(1, 2)));
        adj.add(new ArrayList<>(List.of(3)));
        adj.add(new ArrayList<>(List.of(4)));
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        System.out.println(dfsOfGraph(V,adj));
    }

    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>>adj, ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj,ls);
            }
        }
    }
    public static ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        boolean vis[] =new boolean[V];
        vis[0]=true;
        ArrayList<Integer>ls=new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
    }
}
