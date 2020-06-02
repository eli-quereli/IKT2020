package uebungen.uebung02_doublyLinkedList;
import de.htwberlin.fiw.profiler.Profiler;
import de.htwberlin.fiw.profiler.ProfiledClass;
import java.util.Random;

public class mainSet extends ProfiledClass {

    Set s = new Set();

    Random r = new Random();
    final int MAX = 10000;

    public void run() {

        for(int i = 0; i < MAX; i++) {

            int x = r.nextInt(10000);
            Element e = new Element(x);
            s.add(e);
        }

        for(int i = 0; i < s.getSize(); i++) {

            System.out.println(s.get(i).getData());

        }

        for(int i = s.getSize()-1; i >= 0; i--) {

            System.out.println(s.get(i).getData());
        }

    }


    public static void main(String[] args) {

        Profiler profiler = new Profiler(mainSet.class);
        profiler.start();
        profiler.printResults();
    }
}