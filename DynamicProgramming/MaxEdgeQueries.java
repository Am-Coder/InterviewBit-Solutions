public class Solution {
    static HashMap<Integer,Integer>[] gp;
    static int[] depth;
    static int[][] parent;
    static int[][] dp;
    public int[] solve(int[][] A, int[][] B) {
        int n = A.length+1;
        gp = new HashMap[n+1];
        for(int i=0;i<=n;i++)gp[i]=new HashMap();
        for(int[] i:A){
            gp[i[0]].put(i[1],i[2]);
            gp[i[1]].put(i[0],i[2]);
        }
        dp=new int[n+1][20];
        parent=new int[n+1][20];
        depth=new int[n+1];
        dfs(1,1,0);
        for(int j=1;j<20;j++){
            for(int i=2;i<=n;i++){
                dp[i][j]=Math.max(dp[i][j-1],dp[parent[i][j-1]][j-1]);
            }
        }
        int cnt=0;
        int[] res=new int[B.length];
        for(int i[]:B){
            int a=i[0];
            int b=i[1];
            int max=0;
            if(depth[a]>depth[b]){
                int temp=a;
                a=b;
                b=temp;
            }
            int d=depth[b]-depth[a];
            for(int j=19;j>=0;j--){
                if((d&(1<<j))>0){
                    d-=(1<<j);
                    max=Math.max(max,dp[b][j]);
                    b=parent[b][j];
                }
            }
            if(a==b){
                res[cnt++]=max;
                continue;
            }
            for(int j=19;j>=0;j--){
                if(parent[a][j]!=parent[b][j]){
                    max=Math.max(max,dp[a][j]);
                    max=Math.max(max,dp[b][j]);
                    a=parent[a][j];
                    b=parent[b][j];
                }
            }
           max=Math.max(max,dp[a][0]);
                max=Math.max(max,dp[b][0]);
                res[cnt++]=max;
        }
        return res;
        
    }
    static void dfs(int i,int pa,int l){
        parent[i][0]=pa;
        depth[i]=l;
        for(int j=1;j<20;j++)
        parent[i][j]=parent[parent[i][j-1]][j-1];
        for(int j:gp[i].keySet()){
            if(j==pa){
                dp[i][0]=gp[i].get(j);
                continue;
            }
            dfs(j,i,l+1);
        }
    }
}

