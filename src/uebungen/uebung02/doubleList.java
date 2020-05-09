package uebungen.uebung02;

//Attribute der doppelt verketteten Liste: Erstes und letztes Element
//Konstruktor (erzeugt eine leere Liste)

//a) prepend - Element am Anfang einfügen
//b) append - Element am Ende einfügen
//c) insert - Element an einer angegebenen Position einzufügen
//d) get - ein Element an einer gegebenen Position abrufen
//e) remove - Element an einer angegebenen Position löschen
//f) contains - prüft, ob das übergebene Element in der Liste enthalten ist
//g) size - gibt aus, wie viele Elemente in der Liste enthalten sind


public class doubleList {

    private listElement firstEl, lastEl;

    //Erzeugt eine leere Liste
    public doubleList() {
        listElement firstEl = null;
        listElement lastEl = null;
    }

    //Liefert das erste Element der Liste
    public listElement getFirstEl() { return firstEl; }

    //Liefert das letzte Element der Liste
    public listElement getLastEl() { return lastEl; }

    //Fügt das übergebene Element ans Ende der Liste an

    public void append(listElement element) {

        //Falls die Liste leer ist, erzeuge ein neues listenElement als erstes Element und
        //weise ihm den Wert zu, den append() uebergeben hat
        if(firstEl == null) {

            firstEl = new listElement(element);
            lastEl = new listElement(null);
            firstEl.setNextElement(lastEl);
            lastEl.setPrevElement(firstEl);
        }

        else {
            element.setNextElement(getLastEl());
            element.setPrevElement(getLastEl().getprevElement());
        }
    }

    //Fuegt das uebergebene Element am Anfang der Liste ein
    public void prepend(listElement element) {

        listElement temp1 = getFirstEl();
        listElement temp2 = getFirstEl().getNextElement();

        element.setNextElement(element);

    }

    //Fuegt das uebergebene Element an der uebergebenen Position ein
    public void insert(int insertPosition, listElement element) {

        listElement aktElement = getFirstEl();

        for(int i = 0; i < insertPosition; i++) {

            aktElement = aktElement.getNextElement();

        }

        listElement temp = aktElement.getNextElement();
        aktElement.setNextElement(element);
        element.setNextElement(temp);
    }

    //Liefert das Listenelement zurueck, das sich an der uebergebenen Position befindet
    public listElement get(int position) {

        listElement aktElement = getFirstEl();

        for(int i = 0; i < position; i++) {

            aktElement = aktElement.getNextElement();

        }
        return aktElement;
    }


    //Entfernt das Listenelement, das sich an der uebergebenen Position befindet
    public void remove(int position) {

        listElement aktElement = getFirstEl();

        for (int i = 0; i < position; i++) {

            aktElement = aktElement.getNextElement();
        }

        aktElement = aktElement.getNextElement();
        listElement nextElement = aktElement.getNextElement().getNextElement();
        aktElement.setNextElement(nextElement);

    }

    //Prueft, ob sich das uebergebene Element bereits in der Liste befindet
    public boolean contains(listElement element) {

        listElement aktElement = getFirstEl();
        boolean contains = false;

        while(aktElement.getNextElement() != null) {

            aktElement = aktElement.getNextElement();

            if (aktElement.equals(element)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public int size() {

        listElement aktElement = getFirstEl();
        int size = 0;

        while(aktElement != null) {

            aktElement = aktElement.getNextElement();
            size++;
        }

        return size;
    }


    public void print() {

        listElement aktElement = this.getFirstEl().getNextElement();

        while(aktElement.getNextElement() != null) {

            System.out.println(aktElement.getObject());
            aktElement = aktElement.getNextElement();

        }

        System.out.println(aktElement.getObject());
    }

    public void printReverse(int listLength) {

        listElement aktElement;

        for(int i = listLength; i >= 0; i--) {

            aktElement = get(i);
            System.out.println(aktElement.getObject());
            aktElement = aktElement.getNextElement();
        }
    }


}

