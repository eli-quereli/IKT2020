package uebungen.uebung02_doublyLinkedList;

public class Set extends doublyLinkedList_v2 {

    int size = 0;

   public Set() {
       super();

    }

    public boolean add(Element e) {

       boolean addElement = true;

       if(!(this.contains(e.getData()))) {

           if(this.getFirst() == null) {
               this.prepend(e);
           }

           if(e.getData() < this.getFirst().getData()) {
               this.prepend(e);
           }

           else if (e.getData() > this.getLast().getData()) {
               this.append(e);
           }

           else {
               //this.insert(e, this.findInsertPosition(e));
           }

           this.size++;
       }


       else {
           addElement = false;

       }

       return addElement;

    }



    @Override
    public void prepend(Element e) {
       super.prepend(e);
    }

    @Override
    public void append(Element e) {
       super.append(e);
   }

    @Override
    public void insert(Element e, int index) {
       super.insert(e, index);
    }

    @Override
    public void remove(int index) {
        super.remove(index);
        this.size--;
    }


    //Sucht die richtige Einfuegeposition fuer ein Element in der sortierten Menge
    public int findInsertPosition(Element e) {

       int center = this.size / 2;
       int i = -1;

       if(get(center).getData() > e.getData()) {

           Element x = this.getFirst();

           for(i = 0; i < center; i++) {

               while(x.getData() < e.getData())
               x = x.successor;
           }
       }

       else {
           Element x = this.getLast();

           for(i = size; i > center; i--) {

               while(x.getData() > e.getData()) {
                   x = x.predecessor;
               }
           }
       }
       return i;
    }

    @Override
    public void printList() {
        super.printList();
    }
}


