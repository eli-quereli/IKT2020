package uebungen.uebung02_v3;

public class main {

    public static void main(String[] args) {

        doublyLinkedList myList = new doublyLinkedList();

        System.out.println(myList);

        Element testE = new Element(1);
        Element testE1 = new Element(3);
        Element testE2 = new Element(5);
        Element testE3 = new Element(9);


        // System.out.println(testE.getData());
      //  System.out.println(testE1.getData());
      //  System.out.println(testE2.getData());

        /*myList.prepend(testE);
        myList.prepend(testE1);
        myList.prepend(testE2);*/

        for(int i = 1; i <= 10; i++) {

            Element e = new Element(i);
            myList.append(e);

        }


        //myList.insert((new Element(23)), 2);

        myList.remove(3);
        /*myList.append(testE3);
        myList.append(testE);
        myList.append(testE1);
        myList.append(testE2);*/



        //System.out.println(myList.get(2).getData());
        myList.printList();

        System.out.println(myList.contains(0));
        System.out.println(myList.get(2).getData());

    }



}
