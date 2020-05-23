package uebungen.uebung02_v1;

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

    private listElement firstEl;
    private listElement lastEl;

    //Erzeugt eine leere Liste
    public doubleList() {
        listElement firstEl;
        listElement lastEl;
    }

    //Liefert das erste Element der Liste
    public listElement getFirstEl() { return this.firstEl; }
    //public listElement getLastEl() { return this.lastEl; }

    //-> Nicht so richtig hilfreich, weil lastEl nicht gespeichert wird, sondern immer wieder
    //neu berechnet werden muss durch vollständiges Durchlaufen der Liste

    public listElement getLastElement () {

            listElement aktElement = firstEl; //beim Startelement beginnen

            //Die Liste durchlaufen bis das letzte Element erreicht ist
            //Das letzte Element der Liste ist dasjenige ohne Nachfolger, also das mit einem Null-Pointer

            while(aktElement.hasNext()) {

                aktElement = aktElement.next; //Bei jeder Wiederholung wird das nachfolgende Element geprüft
            }

            return aktElement;
        }

    //Fügt das übergebene Element ans Ende der Liste an
    public void append(listElement element) {

        //Falls die Liste leer ist, setze das uebergebene Element als erstes Element;

        if(this.firstEl == null) {

            this.firstEl = element;
            this.lastEl = element;

        }

        else {

            lastEl = getLastElement();
            lastEl.next = element;
            element.prev = lastEl;

        }
    }

    //Liefert das Listenelement zurueck, das sich an der uebergebenen Position befindet
    public listElement get(int position) {

        int center = this.size() / 2 ;

        listElement aktEl = this.firstEl;

        //Wenn die Einfuegeposition in der linken Haelfte des Feldes liegt = kleiner oder gleich die Mitte ist
        //Vorne beginnen und bis zur gegebenen Position durchlaufen via Nachfolger

        if(position == 0) {
            return aktEl;
        }

        else if (position <= center) {

            aktEl = getFirstEl();

            for (int i = 0; i < position; i++) {
                aktEl = aktEl.next;
            }
        }

        //Wenn die Einfuegeposition in der zweiten Haelfte des Feldes liegt = groesser als die Mitte ist:
        //Hinten beginnen und bis zur gegegebenen Position durchlaufen vie Vorgaenger
        else if (position > center) {

            aktEl = this.lastEl;

            for (int i = this.size(); i > position; i--) {

                aktEl = aktEl.prev;
            }
        }

        return aktEl;
    }


    //Fuegt das uebergebene Element am Anfang der Liste ein
    public void prepend(listElement element) {

        if(this.firstEl == null) {
            this.firstEl = element;
        }

        else {
            listElement firstElement = getFirstEl();
            element.next = firstElement;
            firstElement.prev = element;
        }
    }

    //Fuegt das uebergebene Element an der uebergebenen Position ein
    public void insert(int insertPosition, listElement element) {

        listElement aktElement = get(insertPosition);

        aktElement.next = element;
        element.prev = aktElement;
    }


    //Entfernt das Listenelement, das sich an der uebergebenen Position befindet
    public void remove(int position) {

        listElement aktEl = this.get(position);

        aktEl.next.prev = aktEl.prev;
        aktEl.prev.next = aktEl.next;
    }

    //Prueft, ob sich das uebergebene Element bereits in der Liste befindet
    public boolean contains(listElement element) {

        listElement aktElement = getFirstEl();
        boolean contains = false;

        while(aktElement.next != null) {

            aktElement = aktElement.next;

            if (aktElement.equals(element)) {
                contains = true;
                break;
            }
        }
        return contains;
    }



    public int size() {

        int size = 0;

        //Wenn die Liste leer ist, gib 0 zurück
        if(this.firstEl == null) { return size; }

        //andernfalls: durchlaufe die Liste, solange das aktuelle Element einen Nachfolger hat und erhoehe den Counter
        //fuer die Variable size

        else {

            listElement aktEl = getFirstEl();

            while(aktEl.hasNext()) {

                aktEl = aktEl.next;
                size++;
            }}

        return size;
        }


        //PRINT-METHODEN
        public void print () {

            for (int i = 0; i < this.size(); i++) {

                    System.out.println(this.get(i).getObject());
                }
            }

        public void printReverse () {

            for (int i = this.size(); i > 0; i--) {

                System.out.println(this.get(i).getObject());
            }
        }
    }



