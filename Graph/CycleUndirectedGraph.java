public class Solution {
    int ans=0;
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        ans=0;
        ArrayList<ArrayList<Integer>> g=new ArrayList<>();
        for(int i=0;i<A;i++)
        {
            ArrayList<Integer> l=new ArrayList<>();
            g.add(l);
        }
        //create graph
        for(int i=0;i<B.size();i++)
        {
            g.get(B.get(i).get(0)-1).add(B.get(i).get(1)-1);
            g.get(B.get(i).get(1)-1).add(B.get(i).get(0)-1);
        }
        boolean vis[]=new boolean[A];
        for(int i=0;i<A;i++)
        {
            if(vis[i]==false){
                DFS(vis,i,g,-1);
            }
        }
        
        return ans;   
    }

    public void DFS(boolean vis[],int v,ArrayList<ArrayList<Integer>> g,int parent)
    {
        vis[v]=true;
        for(int u:g.get(v))
        {
            if(vis[u]==true&&parent!=u)
            {
                ans=1;
            }
            else if(vis[u]==false)
            {
                DFS(vis,u,g,v);
            }
        }
    }
}
