//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean check(int src,ArrayList<ArrayList<Integer>> adj,int vis[],int n){
        
        vis[src]=1;
        Queue<Pair> q =new LinkedList<>();
        q.add(new Pair(src,-1));
        
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.remove();
            
            for(int i:adj.get(node)){
                if(vis[i]==0){
                    vis[i]=1;
                    q.add(new Pair(i,node));
                }
                else if(vis[i]==1 && parent!=i){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n=adj.size();
        int vis[]=new int[n+1];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(check(i,adj,vis,n)) return true;
            }
        }
        return false;
        
    }
}
class Pair{
    int first,second;
    Pair(int f,int s){
        this.first=f;
        this.second=s;
    }
}