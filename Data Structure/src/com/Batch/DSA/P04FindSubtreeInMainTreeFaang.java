package com.Batch.DSA;

public class P04FindSubtreeInMainTreeFaang {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val =val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null){
            return true;
        }
        if (root == null || subRoot == null){
            return false;
        }
        if (root.val == subRoot.val){
          return   isIdentical(root.left,subRoot.left)  || isIdentical(root.right , subRoot.right);
        }
        return false;
    }

    public boolean isSubTree(TreeNode root, TreeNode subRoot){
        if (subRoot == null){
            return true;
        }
        if (root == null){
            return false;
        }
        if (root.val == subRoot.val){
           if (isIdentical(root,subRoot)){
               return true;
           }
        }
       return isSubTree(root.left,subRoot)  || isSubTree(root.right,subRoot);
    }

    public static void main(String[] args) {
        System.out.println("working fine");
    }
}
