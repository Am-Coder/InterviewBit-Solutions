/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
 
public class Solution {
    // Tree to graph to max level in the graph
    public int solve(TreeNode A, int B) {
        
        LinkedList<Integer>[] adj = new LinkedList[100002];
        for(int i=0; i<=100001; i++){
            adj[i] = new LinkedList<Integer>();
        }        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            TreeNode nn = q.poll();
            if(nn.left != null){
                adj[nn.val].add(nn.left.val);
                adj[nn.left.val].add(nn.val);
                q.add(nn.left);
            }
            if(nn.right != null){
                adj[nn.val].add(nn.right.val);
                adj[nn.right.val].add(nn.val);
                q.add(nn.right);
            }
        }
        
        int level = -1;
        Queue<Integer> qq = new LinkedList<>();
        boolean[] vis = new boolean[100002];
        qq.add(B);
        while(!qq.isEmpty()){
            level++;
            int si = qq.size();
            while(si > 0){
                int nn = qq.poll();
                vis[nn] = true;
                for(int chi: adj[nn]){
                    if(!vis[chi])
                        qq.add(chi);
                }
                si--;
            }
        }
        return level;
    }
}
