package org.example.Practice;

import java.util.ArrayList;
import java.util.*;

public class CarDetails {

    public static void main(String[] args) {
//4,2,7,1,3,6,9
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(9);

        dfs(root);

    }
    public static TreeNode dfs(TreeNode root) {
        if(root == null) return null;
        System.out.print(root.val+" ");
       TreeNode temp=root.left;
       root.left=root.right;
       root.right=temp;
        dfs(root.left);
        dfs(root.right);
        return root;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }