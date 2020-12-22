package com.nc.l5;

public class SimpleBinarySearchThree {
    private TreeNode root;


    public boolean contains(int data){
        return containsInternal(root,data);
    }

    private boolean containsInternal(TreeNode node,int data){
        if(node==null)
            return false;
        if (node.getData()==data)
            return true;
        if(data<node.getData())
            return containsInternal(node.getLeft(),data);
        return containsInternal(node.getRight(),data);
    }
}
