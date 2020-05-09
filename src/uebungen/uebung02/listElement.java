package uebungen.uebung02;

//Diese Klasse instanziiert die Listenelement als Objekte

//Die Elemente speichern drei Werte:

// a) Das eigentliche Element der Liste als Objekt der Klasse listElement
// b) Den Verweis auf den Vorgaenger, ebenfalls ein Objekt der Klasse listElement
// c) Den Verweis auf den Nachfolger, ebenfalls ein Objekt der Klasse listElement

// Darüber hinaus enthält die Klasse noch folgende Methoden:

// Mit setNextElement() // setPrevElement() wird der Nachfolger und Vorgaenger für ein Listenelement definiert
// getNextElement() / getPrevElement() liefert den Nachfolger bzw. Vorgaenger eines Listenelements
// getObject() gibt das das an dieser Stelle der Liste gespeicherte Objekt zurueck
// equals() vergleicht zwei Objekte der Klasse listElement = konkret: ob sie den gleichen Wert für obj haben


public class listElement {

    public Object obj;
    public listElement prevElement, nextElement;

    public listElement(Object obj) {
        this.obj = obj;
        this.prevElement = null;
        this.nextElement = null;
    }

    public void setNextElement (listElement nextElement){  this.nextElement = nextElement;  }

    public void setPrevElement (listElement prevElement) { this.prevElement = prevElement; }

    public listElement getNextElement() { return nextElement; }

    public listElement getprevElement() { return prevElement; }

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



