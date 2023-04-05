package DataStructures;

import java.util.HashMap;
import java.util.LinkedList;

class TreeActions{
    Node insert(Node root,int data){
       if(data<=root.data){
           if(root.left==null){
               root.left=new Node(data);
           }
           else{
               root.left=insert(root.left,data);
           }
       }
       else{
           if(root.right==null){
               root.right=new Node(data);
           }
           else{
               root.left=insert(root.right,data);
           }
       }
       return root;
    }
    Node insert2(Node root,int data){
        if(root==null){
            root=new Node(data);
        }
        else{
            if(root.data>data){
                root.left=insert2(root.left,data);
            }
            else{
                root.right=insert2(root.right,data);
            }
        }
        return root;
    }
    void traverse(Node root){
        if(root!=null){
            traverse(root.left);
            System.out.print(root.data+",");
            traverse(root.right);
        }
    }
    int minVal(Node root){
        if(root.left!=null){
            return minVal(root.left);
        }
        else{
            return root.data;
        }
    }
    Node delete(Node root,int data){
        if(root==null){
            return root;
        }
        else if(root.data==data) {
            if (root.right == null && root.left == null) {
                root = null;
                return root;
            }
            else{
                int min=minVal(root.right);
                root.data=min;
                root.right=delete(root.right,min);
                return root;
            }
        }
        else{
            if(root.data>data){
                root.left=delete(root.left,data);
            }
            else{
                root.right=delete(root.right,data);
            }
        }
        return root;
    }
}
public class Tree {
    public static void main(String[]args){
        TreeActions l=new TreeActions();
        Node root=new Node(10);
        for(int i=0;i<10;i++){
            int x=(int)(Math.random()*20);
            l.insert(root,x);
        }
        Node root2=new Node(10);
       // l.traverse(root);
        System.out.println();
        for(int i=0;i<10;i++){
            int x=(int)(Math.random()*20);
            l.insert2(root2,x);
        }
        //l.traverse(root);
      //  l.delete(root,15);
        //System.out.println();
       // l.traverse(root);
        Node org=null;
        int[] arr=new int[10];

        for(int i=0;i<10;i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+",");
        }
        for(int i=0;i<10;i++){
            if(i==0){
                org=new Node(arr[i]);
            }
            else{
                l.insert(org,arr[i]);
            }
        }
        l.traverse(org);
    }
}
