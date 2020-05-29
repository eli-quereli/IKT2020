package uebungen.uebung04_directedGraph;
import uebungen.uebung02_doublyLinkedList.doublyLinkedList;

public class Node {

    String name;
    Node parent;
    doublyLinkedList children;

    public Node(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public doublyLinkedList getChildren() { return this.children;}
    public Node getParent() {return this.parent;}

    public boolean isLeaf() {
        return this.getChildren() == null;
    }

    public boolean isRoot() {
        return this.getParent() == null;
    }

}
