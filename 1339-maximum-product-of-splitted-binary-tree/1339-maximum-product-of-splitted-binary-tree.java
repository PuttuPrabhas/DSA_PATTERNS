/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private long mod = 1000000007L;
    private long ans = 0;
    private long dfs (TreeNode node){
        if(node == null){
            return 0;
        }
        node.val+=dfs(node.left)+dfs(node.right);
        return node.val;
    }
    public int maxProduct(TreeNode root) {
        long sum = dfs(root);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp  = q.poll();
            if(temp == null) continue;
            long current = (sum-temp.val)*temp.val;
            ans = Math.max(ans,current);
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        return (int)(ans%mod);

        
    }
}