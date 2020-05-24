package uebungen.uebung01_singlyLinkedList;


//Diese Klasse instanziiert die Listenelement als Objekte
//Die Elemente speichern zwei Werte:
// a) Das eigentliche Element der Liste als Objekt der Klasse listElement
// b) Den Verweis auf den Nachfolger, ebenfalls ein Objekt der Klasse listElement
// Darüber hinaus enthält die Klasse noch folgende Methoden:
// Mit setNextElement() wird der Nachfolger für ein Listenelement definiert
// getNextElement() liefert den Nachfolger eines Listenelements
// getObjet() gibt das listenElement zurück (bzw. das an dieser Stelle der Liste gespeicherte Objekt)


public class listElement {

    Object obj;
    listElement nextElement;

    public listElement(Object object) {
        this.obj = object;
        this.nextElement = null;
    }

    public void setNextElement (listElement nextElement){

        this.nextElement = nextElement;
    }

    public listElement getNextElement() {

        return nextElement;
    }

    public Object getObject() {
        return obj;
    }

    @Override
    public boolean equals(Object other) {

        if(other == null) return false;
        if(this == other) return true;
        if(this.getClass() == other.getClass()) return true;

        listElement otherListElement = (listElement)other;

        return this.obj == otherListElement.obj;
    }
}



