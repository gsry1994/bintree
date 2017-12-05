package com.example.awesomefat.csc537_homework5_template;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by awesomefat on 11/28/17.
 */

public class BinaryTree
{
    private Node root;
    private int count;
    private String result;
    private String result1;

    public BinaryTree()
    {
        this.root = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void add(int payload)
    {
        Node n = new Node(payload);
        this.count++;

        if(this.root == null)
        {
            this.root = n;
        }
        else
        {
            //we know that this.root is a thing
            this.root.add(n);
        }
    }

    public void inorder(Node node)
    {
        if (node == null)
            return;
        inorder(node.getLeftChild());
        result=result+ " --> "+ node.getPayload();
        inorder(node.getRightChild());

    }

    public void preorder(Node node)
    {
        if (node == null)
            return;
        result= result+ " --> "+ node.getPayload();
        preorder(node.getLeftChild());
        preorder(node.getRightChild());
    }

    public void postorder(Node node)
    {
        if (node == null)
            return;
        postorder(node.getLeftChild());
        postorder(node.getRightChild());
        result= result+ " --> "+ node.getPayload();
    }
    

    public String runi(int order)
    {
        result="";
        result1="";
        if (order==1)
        {
            inorder(this.root);
            result1= "InOrder " + result;
        }
        else if (order==2)
        {
            preorder(this.root);
            result1= "PreOrder " + result;
        }
        else if (order==3)
        {
            postorder(this.root);
            result1= "PostOrder " + result;
        }

        return  result1;
    }
}
