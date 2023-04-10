/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper1(root, sb);
        return sb.substring(0, sb.length() - 1);
    }

    private void helper1(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#").append(",");
            return;
        }
        sb.append(root.val).append(",");
        helper1(root.left, sb);
        helper1(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strs = data.split(",");
        int[] idx = {0};
        return helper2(strs, idx);
    }

    private TreeNode helper2(String[] strs, int[] idx) {
        if (idx[0] == strs.length || strs[idx[0]].equals("#")) {
            idx[0]++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(strs[idx[0]++]));
        root.left = helper2(strs, idx);
        root.right = helper2(strs, idx);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));