package uebungen.UE02_doublyLinkedList;

import de.htwberlin.fiw.profiler.ProfiledClass;
import de.htwberlin.fiw.profiler.Profiler;
import java.util.Random;


public class Main extends ProfiledClass {

    public void run() {

        Set mySet = new Set();

       // doublyLinkedList myList = new doublyLinkedList();
        Random random = new Random();
        final int BOUND = 10;
        final int MAX = 10;


        //10000 Zufallszahlen in die Liste einfügen
        /*for (int i = 0; i < MAX; i++) {

            mySet.add(new Element(random.nextInt(BOUND)));
            //myList.append(new Element(random.nextInt(BOUND)));
        }*/

        //Zahlen vom Anfang bis zum Ende ausgeben
        //myList.print();

        for (int i = 10; i > 0; i--) {

            mySet.add(new Element(i));

        }

        mySet.print();

        //Zahlen vom Ende bis zum Anfang ausgeben
        //myList.printReverse();
        //mySet.printReverse();

    }

    public static void main(String[] args) {

        //Profiler erzeugen und Laufzeit messen
        Profiler profiler = new Profiler(Main.class);
        profiler.start();
        profiler.printResults();

    }

}

