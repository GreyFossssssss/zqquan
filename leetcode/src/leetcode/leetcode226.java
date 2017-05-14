package leetcode;

public class leetcode226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   public static TreeNode invertTree(TreeNode root) {
	   if(root==null){
		   return null;
	   }
	   final TreeNode left=root.left;
	   final TreeNode right=root.right;
	   root.left=invertTree(right);
	   root.right=invertTree(left);
	   return root;
    }
}
