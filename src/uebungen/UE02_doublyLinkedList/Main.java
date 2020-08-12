package uebungen.UE02_doublyLinkedList;

import de.htwberlin.fiw.profiler.ProfiledClass;
import de.htwberlin.fiw.profiler.Profiler;
import java.util.Random;


public class Main extends ProfiledClass {

    public void run() {

        doublyLinkedList myList = new doublyLinkedList();
        Random random = new Random();
        final int BOUND = 10000;
        final int MAX = 10000;


        //10000 Zufallszahlen in die Liste einfügen
        for (int i = 0; i < MAX; i++) {

            myList.append(new Element(random.nextInt(BOUND)));
        }

        //Zahlen vom Anfang bis zum Ende ausgeben
        myList.print();

        //Zahlen vom Ende bis zum Anfang ausgeben
        myList.printReverse();

        System.out.println("Number of elements: " + myList.getSize());
    }

    public static void main(String[] args) {

        //Profiler erzeugen und Laufzeit messen
        Profiler profiler = new Profiler(Main.class);
        profiler.start();
        profiler.printResults();

    }

}

