package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name) {
        this.name = name;
    }

    private boolean hasLeftChild() {
        return this.leftChild != null;
    }

    private boolean hasRightChild() {
        return this.rightChild != null;
    }

    public void add(String nameOfNewNode) {
        recAddHelper(this, nameOfNewNode);
    }

    private void recAddHelper(Node root, String nameOfNewNode) {
        if (nameOfNewNode.compareToIgnoreCase(root.name) <= 0) { // newNode is alphabetically before or same as the root
            if (root.hasLeftChild()) {
                recAddHelper(root.leftChild, nameOfNewNode);
            } else {
                root.leftChild = new Node(nameOfNewNode);
            }
        } else { // new Node is alphabetically after root
            if (root.hasRightChild()) {
                recAddHelper(root.rightChild, nameOfNewNode);
            } else {
                root.rightChild = new Node(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        return recNamesHelper(new ArrayList<String>(), this);
    }

    // Inorder Traversal: DFS
    private List<String> recNamesHelper(List<String> names, Node root) {
        if (root == null) {
            return names;
        }
        recNamesHelper(names, root.leftChild);
        names.add(root.name);
        recNamesHelper(names, root.rightChild);
        return names;
    }
}