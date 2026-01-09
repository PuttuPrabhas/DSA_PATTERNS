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
    int max = 0;
    TreeNode ans ;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        f(root,0);
        return ans;
    }
    public int f(TreeNode curr , int d){
        if(curr==null) {
            max  = Math.max(max,d);
            return d;
        }
        int dl = f(curr.left,d+1);
        int dr = f(curr.right,d+1);
        if(dl==dr && dl==max){
            ans = curr;
        }
        return Math.max(dl,dr);
    }
}