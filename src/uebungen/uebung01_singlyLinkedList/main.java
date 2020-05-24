package uebungen.uebung01_singlyLinkedList;

import de.htwberlin.fiw.profiler.ProfiledClass;
import de.htwberlin.fiw.profiler.Profiler;

import java.util.Random;

public class main extends ProfiledClass {

    public void run() {

        singleList myList = new singleList();
        Random random = new Random();
        final int BOUND = 10000;
        final int MAX = 10000;

        //10000 Zufallszahlen in die Liste einfügen
        //Zahlen vom Anfang bis zum Ende ausgeben
        //Zahlen vom Ende bis zum Anfang ausgeben
        //Profiler erzeugen und Laufzeit messen

        for(int i = 0; i <= MAX; i++) {

            long number = random.nextInt(BOUND);
            listElement element = new listElement(number);
            myList.append(element);

        }

        myList.print();
        myList.printReverse(MAX);
    }

    public static void main(String[] args) {

        Profiler profiler = new Profiler(main.class);
        profiler.start();
        profiler.printResults();

    }

}



