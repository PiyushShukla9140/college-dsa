// Dijikstra algo is used to find the shortest path ia a graph
// THis algo only works on the weighted graph
// It doesnt work on graphs whioch has negative weights, it only works on the graphs that has positive weights and costs


// Steo 1 Initialize
// Step 2 Pick the shortest distance one edge by edge
// Step 3 Explore ohter paths
// Step 4 compare shrotest path and expored path
// Step 5 relax (just pick the shorter path and retrutn it)
import java.util.ArrayList;
public class Dijikstra{
    static class Edge{
        int to;
        int weight;
        Egde(int to , int weight){
            this.to = to;
            this.weight = weight;
        }
    }
    static void addEdge(ArrayList<ArrayList<Edge>> graph, int u, int v, int weight){
        // u = source node
        // v = destination node
        graph.get(u).add(new Edge(v,weight));
        // unweighted graph
        graph.get(v).add(new Edge(u,weight));
        


    }

    static void dijikstra(int v, ArrayList<ArrayList<Edge>> graph, int source){
        int [] distance = new int[v];
        Arrays.fill(distance,Integer.MAX_VALUE);
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        distance[source] = 0;
        pq.add(new int[] {0,source});
        while(!pq.isEmpty()){
            int [] current = pq.poll();
            int currentDistance = current[0];
            int currentNode = current[1];

            // check neighbours
            for(Edge edge : graph.get(currentNode)){
                int neightbour = edge.to;
                int weight = edge.weight;
                int newDistance = currentDistance + weight;

                // relax step
                if(currentDistance < distance[neighbour]){
                    distance[neighbour] = newDistance;
                    pq.add(new int[]{newDistance , neighbour});
                }
            }
        }    
    }
    public static void main(String[]args){
        int v = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
        addEdge(graph,0,1,4);
        addEdge(graph,0,2,2);
        addEdge(graph,1,2,1);
        addEdge(graph,1,3,5);
        addEdge(graph,2,3,8);
        addEdge(graph,2,4,10);
        addEdge(graph,3,4,2);

    }
}