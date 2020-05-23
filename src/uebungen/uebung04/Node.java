package uebungen.uebung04;
import uebungen.uebung01.singleList;

public class Node {

    String name;
    Node parent;
    singleList children;

    public Node(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public singleList getChildren() { return this.children;};

    //public Node getParent() {return this.parent};

    public boolean isLeaf() {

        return this.children.getStartElement() == null;

    }




}
