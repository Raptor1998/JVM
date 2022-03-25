package com.raptor.Third;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.value = value;
    }


    void print(TreeNode root, List<Integer> list) {
        if (root!=null){
            list.add(root.value);
        }
        if (root!=null && root.left==null && root.right == null) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }

        }else {
            if (root.left!=null){
                print(root.left, list);
            }
            if (root.right!=null){
                print(root.right, list);
            }

        }

    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode4.right = treeNode6;
        new TreeNode().print(treeNode1, new ArrayList<>());

    }

}
