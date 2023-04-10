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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null) return list;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            list.addFirst(currentNode.val);
            if(currentNode.left!=null)
                stack.push(currentNode.left);
            if(currentNode.right!=null)
                stack.push(currentNode.right);
        }
        return list;
    }
}