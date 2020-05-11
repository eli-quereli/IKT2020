package uebungen.uebung02_v1;

import de.htwberlin.fiw.profiler.ProfiledClass;
import de.htwberlin.fiw.profiler.Profiler;
import java.util.Random;


public class main extends ProfiledClass {

    public void run() {

        doubleList myList = new doubleList();
        Random random = new Random();
        final int BOUND = 10000;
        final int MAX = 3;

        //10000 Zufallszahlen in die Liste einfügen
        //Zahlen vom Anfang bis zum Ende ausgeben
        //Zahlen vom Ende bis zum Anfang ausgeben
        //Profiler erzeugen und Laufzeit messen

        for(int i = 0; i <= MAX; i++) {

            long number = random.nextInt(BOUND);
            listElement element = new listElement(number);
            myList.append(element);

        }

        //        myList.insert(4, new listElement(1.5));

        //myList.append(new listElement(1.5));
        System.out.println("Letztes Element der Liste: " + myList.getLastElement().getObject());

        System.out.println("Anzahl der Elemente: " + myList.size());
        myList.print();
        System.out.println("++++++++++");
        myList.printReverse();
    }

    public static void main(String[] args) {

        Profiler profiler = new Profiler(main.class);
        profiler.start();
        profiler.printResults();

    }

}






