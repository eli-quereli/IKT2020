package uebungen.uebung02_v3;

public class doublyLinkedList {

    private Element first;
    private Element last;

    public doublyLinkedList() {

        this.first = null;
        this.last = null;
    }

    //Ein Element am Anfang einfuegen
    public void prepend(Element e) {

        //Falls die Liste leer ist, setze das uebergebene Element als erstes und letztes Element
        if (this.first == null) {

            this.first = e;
            this.last = e;
        }

        //Sonst: Setze das erste Element als Nachfolger hinter das neue Element e
        //Setze dann das neue Element e als Vorgaenger fuer das bisher erste Element
        //Setze dann e als erstes Element
        else {
            e.successor = first;
            first.predecessor = e;
            this.first = e;
        }
    }


    //Ein Element ans Ende der Liste anhaengen
    public void append(Element e) {

        //Falls die Liste leer ist, setze das Element e als erstes und letztes Element der Liste
        if (this.first == null) {

            this.first = e;
            this.last = e;
        }

        //Sonst: Gehe zum letzten Element der Liste
        //Setze das bisher letzte Element als Vorgaenger von e
        //Setze e als Nachfolger fuer das bisher letzte Element
        //Setze e als nun letztes Element
        else {

            Element lastElement = this.last;
            e.predecessor = lastElement;
            lastElement.successor = e;
            this.last = e;
        }
    }

    //Fuegt ein Element an einem gegebenen Index ein
    public void insert(Element e, int index) {

        //Falls der Index ausserhalb der Liste liegt
        //Wirf eine Exception
      if (index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }


        //Falls der Index der Anfang der Liste ist
        //Verwende prepend
        else if(index == 0) {
            this.prepend(e);
        }

        //Falls der Index das Ende der Liste ist
        //Verwende append
        else if(index == this.size()-1) {
            this.append(e);
      }

        //Sonst:
        else {

            this.get(index-1).successor.predecessor = e;
            e.successor = this.get(index-1).successor;

            this.get(index-1).successor = e;
            e.predecessor = this.get(index-1);
      }
    }

    //Loescht ein Element an einem gegebenen Index
    public void remove(int index) {

        //Falls der Index ausserhalb der Liste liegt
        //Wirf eine Exception
        if (index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }

        else if (index == 0) {

            this.first = this.first.successor;
            this.first.successor.predecessor = null;
        }


        else if (index == this.size()-1) {

            this.last.predecessor.successor = null;
            this.last = this.last.predecessor;
        }

        else {

            Element e = this.first;

            for(int i = 0; i <= index; i++) {

                e = this.get(i);
            }

            e.predecessor.successor = e.successor;
            e.successor.predecessor = e.predecessor;
        }


    }



    //Gibt die Anzahl der Listenelemente zurueck
    public int size() {

        //Falls die Liste leer ist, gib 0 zurueck
        if(this.first == null) { return 0; }

        //Sonst: Beginne beim ersten Element, durchlaufe die Liste
        // und erhoehe size solange es ein Nachfolgelement gibt
        else {
            Element e = this.first;
            int size = 1;

            while (e.successor != null) {
                size++;
                e = e.successor;
            }
            return size;
        }
    }

    //Ruft ein Element der Liste an einem bestimmten Index ab
    public Element get(int index) {

        //Falls der gesuchte Index 0 ist, gib das erste Element der Liste zurueck
        if(index == 0) {
            return this.first;
        }

        //Falls der gesuchte Index der letzte der Liste ist (entspricht size() = Anzahl Elemente-1),
        // dann gib das letzte Element zurueck
        else if (index == this.size()-1) {
            return this.last;
        }

        //Falls der Index groesser als die Liste ist
        //wird eine IndexOutOfBoundsException
        else if (index >= this.size()) {

            throw new IndexOutOfBoundsException();
        }

        //Sonst: Beginne beim ersten Element und durchlaufe die Liste,
        // bis du beim gesuchten Index angekommen bist
        //Gehe dabei jeweils vom aktuellen Element zu dessen Nachfolger-Element
        else {
            Element e = first;

            for(int i = 0; i < index; i++) {
                e = e.successor;
        }
            return e;
        }
    }


    //Prueft, ob eine Zahl x in der Liste enthalten ist
    public boolean contains(int x) {

        Element e = first;

        //Beginne beim ersten Element und durchlaufe die Liste
        for(int i = 0; i < this.size(); i++) {

                //Falls das aktuelle Element den Wert von x hat
                //Gib true zurueck
                if(e.getData() == x) {
                    return true;
                }

                //Sonst: Gehen zum naechsten Element
                else {
                    e = e.successor;
                }
        }

        //Wenn die Liste durchlaufen wurde ohne ein Element mit dem Wert von x zu finden
        //Gib false zurueck
        return false;
    }


    //Gibt die Werte der Liste vom Anfang bis zum Ende aus
    public void printList() {

        for(int i = 0; i < this.size(); i++) {

            System.out.println(this.get(i).getData());

        }


    }
}


