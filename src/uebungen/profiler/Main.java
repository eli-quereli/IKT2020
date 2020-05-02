package uebungen.profiler;

import de.htwberlin.fiw.profiler.ProfiledClass;
import de.htwberlin.fiw.profiler.Profiler;

public class Main extends ProfiledClass {

    public void run() {
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
    }
}
