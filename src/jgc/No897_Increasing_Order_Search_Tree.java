package jgc;

public class No897_Increasing_Order_Search_Tree {
    private TreeNode newRoot, index;

    public void print(TreeNode treeNode) {
        if (treeNode.left != null) {
            print(treeNode.left);
        }
        System.out.print(treeNode.val + "\t");
        if (treeNode.right != null) {
           print(treeNode.right);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        if (root.left != null){
            increasingBST(root.left);
        }
        if (newRoot == null) {
            newRoot = new TreeNode(root.val);
            index = newRoot;
        } else {
            index.right = new TreeNode(root.val);
            index = index.right;
        }
//        print(newRoot);
//        System.out.println();
        if (root.right != null){
            increasingBST(root.right);
        }
        return newRoot;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


