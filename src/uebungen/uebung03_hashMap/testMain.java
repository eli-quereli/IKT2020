package uebungen.uebung03_hashMap;

public class testMain {


    public static void main(String[] args) {

        FIWHashMap test = new FIWHashMap();

        test.put("Witt", "Michael");
        test.put("Siegeris", "Juliane");
        test.put("Lovelace", "Ada");
        test.put("Mihaljevic", "Helena");
        test.put("Freiheit", "Jörn");
        //test.put("Krefting", "Dagmar");

        System.out.println(test.get("Witt"));
        System.out.println(test.get("Lovelace"));

        System.out.println(test.size());




    }



}
