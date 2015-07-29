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
    }

    private boolean hasLeftChild() {
        return this.leftChild != null;
    }

    private boolean hasRightChild() {
        return this.rightChild != null;
    }

    private boolean newNodeIsLeftChild(String nameOfNewNode) {
        return nameOfNewNode.compareToIgnoreCase(this.name) <= 0;
    }

    public void add(String nameOfNewNode) {
        if (this.newNodeIsLeftChild(nameOfNewNode)) {
            if (this.hasLeftChild()) {
                this.leftChild.add(nameOfNewNode);
            } else {
                this.leftChild = new Node(nameOfNewNode);
            }
        } else { // new Node is alphabetically after root
            if (this.hasRightChild()) {
                this.rightChild.add(nameOfNewNode);
            } else {
                this.rightChild = new Node(nameOfNewNode);
            }
        }
    }

//    private void recAddHelper(String nameOfNewNode) {
//
//    }

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