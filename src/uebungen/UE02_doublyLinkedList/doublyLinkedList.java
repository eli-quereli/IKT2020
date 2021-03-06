package uebungen.UE02_doublyLinkedList;

/*

a) prepend - Element am Anfang einfügen
b) append - Element am Ende einfügen
c) insert - Element an einer angegebenen Position einzufügen
d) get - ein Element an einer gegebenen Position abrufen
e) remove - Element an einer angegebenen Position löschen
f) contains - prüft, ob das übergebene Element in der Liste enthalten ist
g) size - gibt aus, wie viele Elemente in der Liste enthalten sind

 */

//set implementieren

public class doublyLinkedList {

    protected Element first;
    protected Element last;
    private int size; //number of elements in the list; is increased if an element is appended, prepended, or inserted; and decreased if an element is removed


    public doublyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }


    // a) prepend - Element am Anfang einfügen
    public void prepend(Element e) {

        if (this.isEmpty()) {
            this.first = e;
            this.last = this.first;
            this.first.successor = this.last;
            this.last.predecessor = this.first;

        } else {
            e.successor = this.first;
            this.first = e;
        }

        this.size++;
    }


    // b) append - Element am Ende einfügen
    public void append(Element e) {

        if (this.isEmpty()) {

            this.first = e;
            this.last = this.first;
            this.first.successor = this.last;
            this.last.predecessor = this.first;
        } else {

            Element last = this.last;
            last.successor = e;
            e.predecessor = last;
            this.last = e;
        }
        this.size++;
    }

    // c) insert - Element an einer angegebenen Position einzufügen
    public void insert(int index, Element e) {

        if (this.isEmpty()) {
            this.append(e);
        }

        if (index == 0) {
            this.prepend(e);
        } else {

            Element temp1 = this.get(index - 1);
            Element temp2 = this.get(index);

            temp1.successor = e;
            e.successor = temp2;
            this.size++;
        }
    }


    // d) get - ein Element an einer gegebenen Position abrufen
    public Element get(int index) throws NullPointerException {

        if (this.isEmpty()) {
            throw new NullPointerException();
        } else if (index < 0 || index > this.getSize() - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            int center = this.getSize() / 2;

            // -> linke haelfte der liste durchsuchen mit first & successor

            if (index <= center) {

                Element e = this.first;

                for (int i = 0; i < index; i++) {

                    e = e.successor;
                }

                return e;
            }

            // index > center -> rechte haelfte der liste durchsuchen mit last & predecessor
            else {

                Element e = this.last;

                for (int i = this.getSize() -1; i > index; i--) {

                    e = e.predecessor;

                }

                return e;

            }

        }
    }


    // e) remove - Element an einer angegebenen Position löschen
    public void remove(int index) throws NullPointerException {

        if (this.isEmpty()) {
            throw new NullPointerException();
        } else {
            Element e = this.get(index);
            Element temp1 = this.get(index - 1);
            Element temp2 = this.get(index);

            temp1.successor = e.getSuccessor();
            temp2.predecessor = e.getPredecessor();
        }

        this.size--;

        if (this.size == 0) {
            this.first = null;
            this.first.successor = null;
        }
    }

    // f) contains - prüft, ob das übergebene Element in der Liste enthalten ist
    public boolean contains(Element e) {

        if (this.isEmpty()) {
            return false;
        } else {

            for (int i = 0; i < this.getSize(); i++) {

                Element current = this.get(i);
                if (current.equals(e)) {
                    return true;
                }
            }

            return false;
        }
    }

    //returns true if list is empty, false else
    public boolean isEmpty() {
        return this.first == null;
    }

    //returns the number of elements in the list
    public int getSize() throws NullPointerException {

        if (this.isEmpty()) {

            throw new NullPointerException();
        } else {
            return this.size;
        }
    }


    //prints all elements of the list from start to end
    public void print() {

        if (this.isEmpty()) {

            System.out.println("Empty list!");

        } else {

            int i;

            for (i = 0; i < this.getSize(); i++) {
                System.out.println(this.get(i).getValue());
            }
        }
    }

    //prints all elements in the list in reverse order (from end to start)
    public void printReverse() throws NullPointerException {

        if (this.isEmpty()) {

            System.out.println("Empty list!");

        } else {

            int i;

            for (i = this.getSize() - 1; i >= 0; i--) {

                System.out.println(this.get(i).getValue());
            }
        }
    }
}








