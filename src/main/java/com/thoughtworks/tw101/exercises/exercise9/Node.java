package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private Node leftChild;
    private Node rightChild;
    private static List<String> names = new ArrayList<>();

    public Node(String name) {
        this.name = name;
        //this.names = new ArrayList<>();
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

    private boolean newNodeIsLeftChild(String nameOfNewNode) {
        return nameOfNewNode.compareToIgnoreCase(this.name) <= 0;
    }

    private void recAddHelper(Node root, String nameOfNewNode) {
        if (root.newNodeIsLeftChild(nameOfNewNode)) {
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
        if (this.hasLeftChild()) {
            this.leftChild.names();
        }
        Node.names.add(this.name);
        if (this.hasRightChild()) {
            this.rightChild.names();
        }
        return Node.names;
    }
}