/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullpattern.utils;

/**
 *
 * @author Test
 */
public class Node {

    private int value;

    private Node leftNode;

    private Node rightNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public Node() {

    }
    
    public Node(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

//    public void add(int newValue) {
//        Node newNode = new Node();
//        if (this.value == null) {
//            this.value = newValue;
//        } else {
//            if (newValue.compareTo(this.value) > 1) {
//                newNode.setValue(newValue);
//                this.rightNode = newNode;
//            } else if (newValue.compareTo(this.value) < 1) {
//                newNode.setValue(newValue);
//                this.leftNode = newNode;
//            }
//        }
//    }

    @Override
    public String toString() {
        if (this.leftNode == null && this.rightNode == null) {
            return "";
        }
        System.out.println(value);
        if (this.leftNode != null) {
            System.out.print(this.leftNode);
        }
        if (this.rightNode != null) {
            System.out.print("        " + this.rightNode);
        }
        return "";
    }

    public void printPostorder(Node node) {
        System.out.println(node);
        if (node == null) {
            return;
        }
        // first recur on left subtree 
        printPostorder(this.leftNode);
        // then recur on right subtree 
        printPostorder(this.rightNode);
        // now deal with the node 
        System.out.print(node.value + " ");
    }

}
