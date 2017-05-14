package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class leetcode104 {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int maxDepth(TreeNode root) {
	        if(root==null) return 0;
	        //else return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	        //这是用栈来解决树的问题
	        Deque<TreeNode> stack = new LinkedList<TreeNode>();
	    	
	    	stack.push(root);
	    	int count = 0;
	    	
	    	while (!stack.isEmpty()) {
	    		int size = stack.size();
	    		while (size-- > 0) {
	    			TreeNode cur = stack.pop();
	    			if (cur.left != null)
	    				stack.addLast(cur.left);
	    			if (cur.right != null)
	    				stack.addLast(cur.right);
	    		}
	    		count++;

	    	}
	    	return count;
	    }
}
