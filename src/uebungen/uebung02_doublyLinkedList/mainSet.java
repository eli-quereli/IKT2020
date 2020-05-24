package uebungen.uebung02_doublyLinkedList;
import de.htwberlin.fiw.profiler.Profiler;
import de.htwberlin.fiw.profiler.ProfiledClass;
import java.util.Random;

public class mainSet extends ProfiledClass {

    doublyLinkedList myList = new doublyLinkedList();
    Random r = new Random();

    public void run() {

        for(int i = 0; i < 10000; i++) {

            int x = r.nextInt(10000);
            Element e = new Element(x);
            myList.append(e);
        }
    }

    public static void main(String[] args) {

        Profiler profiler = new Profiler(mainSet.class);
        profiler.start();
        profiler.printResults();
    }



}