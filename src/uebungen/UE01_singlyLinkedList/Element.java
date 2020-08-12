package uebungen.UE01_singlyLinkedList;

public class Element {

    int value;
    Element successor;

    public Element(int value) {
        this.value = value;
        this.successor = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Element getSuccessor() {
        return successor;
    }

    public void setSuccessor(Element successor) {
        this.successor = successor;
    }

    public boolean hasNext() { return this.getSuccessor() != null; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return value == element.value;
    }
}

