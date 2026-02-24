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
    private int ans = 0;
    private void generate(TreeNode node, StringBuilder sb){
         
         if(node == null) return;
         sb.append(node.val);
        if(node.left == null && node.right == null){
            String s = new String(sb);
            ans += Integer.parseInt(s,2);
        }
        else{
            generate(node.left,sb);
            generate(node.right, sb);
            
        }
        sb.deleteCharAt(sb.length()-1);
    }
    public int sumRootToLeaf(TreeNode root) {
        if(root == null){
            return 0;
        }
        generate(root,new StringBuilder());
        return ans;
    }
}