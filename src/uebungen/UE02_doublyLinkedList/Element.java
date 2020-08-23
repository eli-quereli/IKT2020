package uebungen.UE02_doublyLinkedList;

public class Element {

    int value;
    Element predecessor;
    Element successor;

    public Element(int value) {
        this.value = value;
        this.successor = null;
        this.predecessor = null;
    }

    public int getValue() {
        return value;
    }

    public Element getSuccessor() { return successor; }

    public Element getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Element predecessor) { this.predecessor = predecessor; }

    public void setSuccessor(Element successor) { this.successor = successor; }


    public boolean hasNext() { return this.getSuccessor() != null; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return value == element.value;
    }
}