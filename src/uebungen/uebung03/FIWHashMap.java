package uebungen.uebung03;
import uebungen.uebung01.singleList;

public class FIWHashMap {

    int num_buckets;
    FIWHashMapPair[] hashField;

    public FIWHashMap() {

        this.num_buckets = 256;
        this.hashField = new FIWHashMapPair[num_buckets];

    }

    public FIWHashMap(int num_buckets) {

        this.num_buckets = num_buckets;
        this.hashField = new FIWHashMapPair[num_buckets];

    }

    public void put(String key, String value) {

        //Erzeuge ein neues Hash-Map-Pair
        FIWHashMapPair pair = new FIWHashMapPair(key, value);

        //Erzeuge aus key den hash-Wert i mit Hilfe der Hashfunktion
        //Parameter (für num_entries) ist die Anzahl der Buckets im hashField, also die Laenge des Feldes
        int i = pair.hash(this.hashField.length);

        //Wenn an diesem Index noch kein Wert hinterlegt ist...
        if(this.hashField[i] == null) {

            //...speichere das Has-Map-Pair an der Position i im hashField
            this.hashField[i] = pair;
        }

        //Andernfalls liegt eine Hash-Kollision vor, dann weitermachen mit open addressing
        //Es wird nach dem naechstmoeglichen freien Index gesucht
        else {

            while(this.hashField[i] != null && i < this.hashField.length-1) {
                i++;
            }

           this.hashField[i] = pair;

        }
    }


    public String get(String key) {

        //Berechne den entsprechenden Index zu key mit Hilfe der Hash-Funktion
        int result = 0;
        for (char c : key.toCharArray()) {
            result = (result + c);
        }

        result = result % this.hashField.length;

        //Gib den entsprechenden Wert zurueck, der an diesem Index im hashField abgespeichert ist
        return this.hashField[result].getValue();
    }

    public int size() {

        //Initialisiere einen Counter mit dem Wert 0
        int counter = 0;

        //Durchlaufe das Feld bis zum Ende
        for(int i = 0; i < this.hashField.length; i++) {

            //Falls am jeweiligen Index ein Pair gespeichert ist, erhoehe counter um 1
            if(this.hashField[i] != null) {

                counter++;

            }
        }

        //Am Ende gibt counter die Anzahl aller Felder zurück, die nicht null sind = an denen ein Pair gespeichert ist
        return counter;

    }

}
