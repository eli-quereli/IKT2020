package uebungen.uebung01_v2;

//Konstruktur
//prepend = füge ein Element vor das Startelement ein
//append = füge ein Element hinter dem letzten Element ein
//insert = finde eine Position und füge das neue Element dahinter ein
// --> mit Laufvariable, dann listElement.append(newElement) sowie newElement.append(nextListElement)
//get = rufe ein Element an einer gegebenen Position ab ; mit Laufvariable i + getElement?
//remove = lösche ein Element an einer gegebenen Position mit getElement; setElement
//prüfe = prüfe, ob das übergebene Element in einer Liste enthalten ist -> mit equals


public class singleList {

    private listElement firstElement;
    //private listElement lastElement;

    //Erzeugt eine leere Liste
    public singleList () {  listElement firstElement = null; }

    //Liefert das Startelement der Liste
    public listElement getFirstElement() { return firstElement; }

    //Liefert das letzte Element der Liste (= das ohne Nachfolgerelement)

    public listElement getLastElement () {

        listElement aktElement = firstElement; //beim Startelement beginnen

        //Die Liste durchlaufen bis das letzte Element erreicht ist
        //Das letzte Element der Liste ist dasjenige ohne Nachfolger, also das mit einem Null-Pointer

        while(aktElement.getNextElement() != null) {

            aktElement = aktElement.getNextElement(); //Bei jeder Wiederholung wird das nachfolgende Element geprüft
        }

        return aktElement;
    }

   // public listElement getLastElement () { return lastElement; }

    //Sucht das letzte Element der Liste und fügt das übergebene Element dahinter an
    public void append(listElement element) {

        //Falls die Liste leer ist, erzeuge ein neues listenElement als erstes Element und
        //weise ihm den Wert zu, den append() uebergeben hat

        if(firstElement == null) {

            firstElement = new listElement(element);
        }

        else {

                listElement lastElement = getLastElement();
                lastElement.setNextElement(element);

            }
    }

    public void prepend(listElement element) {

        listElement startElement = getFirstElement();

        element.setNextElement(startElement.getNextElement());
        startElement.setNextElement(element);

    }

    public void insert(int insertPosition, listElement element) {

        listElement aktElement = getFirstElement();

        for(int i = 0; i < insertPosition; i++) {

            aktElement = aktElement.getNextElement();

        }

        listElement temp = aktElement.getNextElement();
        aktElement.setNextElement(element);
        element.setNextElement(temp);
    }

    public listElement get(int position) {

        listElement aktElement = getFirstElement();

        for(int i = 0; i < position; i++) {

            aktElement = aktElement.getNextElement();

        }
        return aktElement;
    }


    public void remove(int position) {

        listElement aktElement = getFirstElement();

        for (int i = 0; i < position; i++) {

            aktElement = aktElement.getNextElement();
        }

        aktElement = aktElement.getNextElement();
        listElement nextElement = aktElement.getNextElement().getNextElement();
        aktElement.setNextElement(nextElement);

    }

    public boolean contains(listElement element) {

        listElement aktElement = getFirstElement();
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

    public void print() {

        listElement aktElement = this.getFirstElement().getNextElement();

        while(aktElement.getNextElement() != null) {

            System.out.println(aktElement.getObject());
            aktElement = aktElement.getNextElement();

        }

        System.out.println(aktElement.getObject());
    }

    public void printReverse(int listLength) {

        listElement aktElement;

        for(int i = listLength; i > 0; i--) {

            aktElement = get(i);
            System.out.println(aktElement.getObject());
            aktElement = aktElement.getNextElement();
        }
    }


}

