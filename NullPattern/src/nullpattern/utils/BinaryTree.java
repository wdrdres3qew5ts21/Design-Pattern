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
public class BinaryTree {

    private Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeftNode(addRecursive(current.getLeftNode(), value));
        } else if (value > current.getValue()) {
            current.setRightNode(addRecursive(current.getRightNode(), value));
        } else {
            return current;
        }

        return current;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.getLeftNode());
            System.out.print(" " + node.getValue());
            traverseInOrder(node.getRightNode());
        }
    }

    public Node getRoot() {
        return root;
    }

    private void setRoot(Node root) {
        this.root = root;
    }

}
