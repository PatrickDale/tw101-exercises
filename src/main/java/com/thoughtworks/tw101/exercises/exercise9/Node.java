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

    private void addNodeToLeftChild(String nameOfNewNode) {
        if (hasLeftChild()) {
            this.leftChild.add(nameOfNewNode);
        } else {
            this.leftChild = new Node(nameOfNewNode);
        }
    }

    private void addNodeToRightChild(String nameOfNewNode) {
        if (hasRightChild()) {
            this.rightChild.add(nameOfNewNode);
        } else {
            this.rightChild = new Node(nameOfNewNode);
        }
    }

    public void add(String nameOfNewNode) {
        if (newNodeIsLeftChild(nameOfNewNode)) {
            addNodeToLeftChild(nameOfNewNode);
        } else {
            addNodeToRightChild(nameOfNewNode);
        }
    }

    public List<String> names() {
        if (hasLeftChild()) {
            this.leftChild.names();
        }
        Node.names.add(this.name);
        if (hasRightChild()) {
            this.rightChild.names();
        }
        return Node.names;
    }
}