package uebungen.uebung03;

public class FIWHashMapPair {

    private String key;
    private String value;

    public FIWHashMapPair(String key, String value) {

        this.key = key;
        this.value = value;

    }

    public String getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    public int hash(int num_entries) {
        int result = 0;
        for (char c : this.getKey().toCharArray()) {
            result = (result + c);
        }
        return (result % num_entries);
    }





}
