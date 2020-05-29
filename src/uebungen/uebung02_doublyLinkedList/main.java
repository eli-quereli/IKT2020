package uebungen.uebung02_doublyLinkedList;
import de.htwberlin.fiw.profiler.Profiler;
import de.htwberlin.fiw.profiler.ProfiledClass;
import java.util.Random;

public class main extends ProfiledClass {

    doublyLinkedList myList = new doublyLinkedList();
    Random r = new Random();
    final int MAX = 10000;

    public void run() {

        for(int i = 0; i < MAX; i++) {

            int x = r.nextInt(10000);
            Element e = new Element(x);
            myList.append(e);
        }

        for(int i = 0; i < MAX; i++) {

            System.out.println(myList.get(i).getData());

        }

        //System.out.println("++++++++++++");

        for(int i = MAX-1; i >= 0; i--) {

            System.out.println(myList.get(i).getData());
        }
    }

    public static void main(String[] args) {

        Profiler profiler = new Profiler(main.class);
        profiler.start();
        profiler.printResults();





    }



}
