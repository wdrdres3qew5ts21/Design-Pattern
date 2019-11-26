/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullpattern;

import nullpattern.utils.BinaryTree;
import nullpattern.utils.Node;


/**
 *
 * @author Test
 */
public class NullPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(14);
        binaryTree.add(2);
        binaryTree.add(7);
        binaryTree.add(22);
        binaryTree.traverseInOrder(binaryTree.getRoot());
        

    }
    
}
