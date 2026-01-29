import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(List.of(1, 2)));
        adj.add(new ArrayList<>(List.of(3)));
        adj.add(new ArrayList<>(List.of(4)));
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        System.out.println(bfsOfGraph(V,adj));
    }

    static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer>q=new LinkedList<>();

        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it : adj.get(node)){
                if(vis[it] == false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
