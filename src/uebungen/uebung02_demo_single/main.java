package uebungen.uebung02_demo_single;

import de.htwberlin.fiw.profiler.ProfiledClass;
import de.htwberlin.fiw.profiler.Profiler;
import java.util.Random;


public class main extends ProfiledClass {

        public void run() {
            // 1. Es wird ein Objekt ihrer Liste erzeugt.
            Element meineListe = null;
            Random r = new Random();
            // 2. Es werden 10000 Zufallszahlen in die Liste eingefügt.
            for (int i = 0; i < 10000; i++) {
                Element e = new Element(r.nextInt());
                if (meineListe == null) {
                    meineListe = e;
                }
                else {
                    meineListe.append(e);
                }
            }

            // 3. Die Zahlen werden vom Anfang bis zum Ende ausgegeben.
            for (int i = 0; i < 10000; i++) {
                Element e = meineListe.get(i);
                System.out.println(e.getData());
            }

            // 4. Die Zahlen werden vom Ende zum Anfang ausgegeben.
            for (int i = 9999; i >= 0; i--) {
                Element e = meineListe.get(i);
                System.out.println(e.getData());
            }
        }

        public static void main(String[] args) {
            Profiler profiler = new Profiler(main.class);
            profiler.start();
            profiler.printResults();
        }
    }


