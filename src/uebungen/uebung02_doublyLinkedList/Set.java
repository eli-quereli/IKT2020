package uebungen.uebung02_doublyLinkedList;

public class Set extends doublyLinkedList {

   public Set() {
       super();

    }

    public boolean add(Element e) {

       if(!(this.contains(e.getData()))) {

           if(this.getSize() == 0 || e.getData() < this.getFirst().getData()) {
               this.prepend(e);
           }

           else if (e.getData() > this.getLast().getData()) {
               this.append(e);
           }

           else {
               this.insert(e, this.findInsertPosition(e));
           }

           return true;
       }

      return false;
   }


    @Override
    public Element getFirst() {
        return super.getFirst();
    }

    @Override
    public Element getLast() {
        return super.getLast();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public Element get(int index) {
        return super.get(index);
    }

    @Override
    public boolean contains(int x) {
        return super.contains(x);
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
    }

    //Sucht die richtige Einfuegeposition fuer ein Element in der sortierten Menge
    public int findInsertPosition(Element e) {

        int i = 0;

        while (this.get(i).getData() < e.getData()) {
            i++;
        }

        return i;
    }

/*        for(int i = 0; i < this.getSize(); i++) {

            if(get(i).getData() > e.getData()) {

                return i-1;
            }
        }
        return this.getSize()-1;


    }


       /*int center = this.size / 2;

       if(get(center).getData() > e.getData()) {

           for(int i = 0; i < center; i++) {

               if(this.get(i).getData() > e.getData())
                   return i;
           }
       }

       else {

           for(int i = size-1; i >= center; i--) {

               if(this.get(i).getData() < e.getData()) {
                  return i;
               }
           }
       }
       return -1;
    }*/

    @Override
    public void printList() {
        super.printList();
    }
}


