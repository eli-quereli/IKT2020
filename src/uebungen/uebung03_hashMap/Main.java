package uebungen.uebung03_hashMap;
import de.htwberlin.fiw.profiler.ProfiledClass;
import de.htwberlin.fiw.profiler.Profiler;
import java.io.*;

public class Main extends ProfiledClass {

    public void run() {

        //Neue HashMap erzeugen
        FIWHashMap myHashMap = new FIWHashMap(32);
        String thisLine ="";

        //Datei artikel.csv einlesen mit BufferedReader
        File csvFile = new File("/Users/elisabetheli/IKT2020/src/uebungen/uebung03/artikel.csv");

        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader(csvFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                if ((thisLine = csvReader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Die csv-Datei zeilenweise auslesen und mit split() am Semikolon separieren
            //Die Werte werden in dem String-Array data abgespeichert
            //data[0] bekommt dabei den Wert vor dem Semikolon = Artikelnummer
            //data[1] bekommt dabei den Wert nach dem Semikolon = Artikel
            String[] data = thisLine.split(";");

                /*//Erzeuge den key mit dem Wert von data[0]
                //Erzeuge den value mit dem Wert von data[1]
                String key = data[0];
                String value = data[1];

                //Fuege einen neuen Eintrag mit key und value als Parameter zur HashMap hinzu
                myHashMap.put(key, value);*/

            //Kuerzer
            myHashMap.put(data[0], data[1]);



        }
        try {
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Gibt die Größe der HashMap aus
        System.out.println(myHashMap.size());

        //Gibt den Wert zum Schluessel "10002165" aus:
        System.out.println(myHashMap.get("10002165"));

        //Gibt den Wert zum Schluessel "10002870" aus:
        System.out.println(myHashMap.get("10002870"));

    }

    public static void main(String[] args) {

        Profiler profiler = new Profiler(Main.class);
        profiler.start();
        profiler.printResults();

    }
}


