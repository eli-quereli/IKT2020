package uebungen.uebung02_v3;

public class main {

    public static void main(String[] args) {

        doublyLinkedList myList = new doublyLinkedList();

        System.out.println(myList);

        Element testE = new Element(1);

        System.out.println(testE.getData());

        myList.prepend(testE);

    }



}
