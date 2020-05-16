package uebungen.uebung02_v3;

public class doublyLinkedList {

    private Element first;
    private Element last;

    public doublyLinkedList() {

        this.first = null;
        this.last = null;
    }

    public void prepend(Element e) {

        if(this.first == null) {

            this.first = e;
            this.last = e;
        }
        else {
            e.successor = first;
            first.predecessor = e;
            this.first = e;
        }
        }

    }


