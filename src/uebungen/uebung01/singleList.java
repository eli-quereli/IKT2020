package uebungen.uebung01;

import de.htwberlin.fiw.profiler.ProfiledClass;
import de.htwberlin.fiw.profiler.Profiler;
import java.util.*;

//Konstruktur
//prepend = füge ein Element vor das Startelement ein
//append = füge ein Element hinter dem letzten Element ein
//insert = finde eine Position und füge das neue Element dahinter ein
// --> mit Laufvariable, dann listElement.append(newElement) sowie newElement.append(nextListElement)
//get = rufe ein Element an einer gegebenen Position ab ; mit Laufvariable i + getElement?
//remove = lösche ein Element an einer gegebenen Position mit getElement; setElement
//prüfe = prüfe, ob das übergebene Element in einer Liste enthalten ist -> mit equals


public class singleList {

    //Erzeugt ein Startelement
    private listElement startElement = new listElement("start");

    //Erzeugt eine leere Liste
    public singleList ( ) { }

    //Liefert das Startelement der Liste
    public listElement getStartElement () { return startElement; }

    //Liefert das letzte Element der Liste (= das ohne Nachfolgerelement)
    public listElement getLastElement () {

        listElement aktElement = startElement; //beim Startelement beginnen

        //Die Liste durchlaufen bis das letzte Element erreicht ist
        //Das letzte Element der Liste ist dasjenige ohne Nachfolger, also das mit einem Null-Pointer

        while(aktElement.getNextElement() != null) {

            aktElement = aktElement.getNextElement(); //Bei jeder Wiederholung wird das nachfolgende Element geprüft
        }

        return aktElement.getNextElement(); //Am Ende angekommen wird das letzte Element der Liste ausgegeben
    }

    //Sucht das letzte Element der Liste und fügt das übergebene Element dahinter an
    public void append(listElement element) {

        listElement lastElement = getLastElement();
        lastElement.setNextElement(element);

    }

    public void prepend(listElement element) {

        listElement startElement = getStartElement();

        element.setNextElement(startElement.getNextElement());
        startElement.setNextElement(element);

    }

    public void insert(int insertPosition, listElement element) {

        listElement aktElement = getStartElement();

        for(int i = 0; i < insertPosition; i++) {

            aktElement = aktElement.getNextElement();

        }

        listElement temp = aktElement.getNextElement();
        aktElement.setNextElement(element);
        element.setNextElement(temp);
    }

    public Object get(int position) {

        listElement aktElement = getStartElement();

        for(int i = 0; i < position; i++) {

            aktElement = aktElement.getNextElement();

        }
        return aktElement.getNextElement();
    }


    public void remove(int position) {

        listElement aktElement = getStartElement();

        for (int i = 0; i < position; i++) {

            aktElement = aktElement.getNextElement();
        }

        aktElement = aktElement.getNextElement();
        listElement nextElement = aktElement.getNextElement().getNextElement();
        aktElement.setNextElement(nextElement);

    }

    public boolean contains(listElement element) {

        listElement aktElement = getStartElement();
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


    public static void main(String[] args) {

        singleList list = new singleList();

        //muss noch angepasst werden für singleList
        //test comment for git

       /* public void run() {
            long ergebnis = 1;
            for (long i = 1; i < 1000000000; i++) {
                ergebnis += i;
            }
            System.out.println("Ergebnis ist: " + ergebnis);
        }
        public static void main(String[] args) {
            Profiler profiler = new Profiler(Main.class);
            profiler.start();
            profiler.printResults();
        }*/
        

       /* Random random = new Random();
        final int BOUND = 10;

        for(int i = 0; i < 10000; i++) {

            int number = random.nextInt(BOUND);
            listElement element = new listElement(number);
            list.append(element);

        }*/
    }



}

