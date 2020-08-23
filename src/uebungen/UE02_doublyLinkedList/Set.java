package uebungen.UE02_doublyLinkedList;

public class Set extends doublyLinkedList {


    public Set() {

        super();
    }

    public void add(Element e) {

        if (this.isEmpty()) {

            this.first = e;
            this.last = this.first;
            this.first.setSuccessor(this.last);
            this.last.setPredecessor(this.first);

        }

        else {

            if (!this.contains(e)) {

                if ( e.getValue() < this.first.getValue()) {

                    this.prepend(e);
                }

                if(e.getValue() > this.last.getValue()) {

                    this.append(e);
                }

                else {

                    this.insert(this.findInsertPosition(e), e);
                }

            } else {
                return;
            }
        }

        }


    public int findInsertPosition(Element e) {

        int i;

        for(i = 0; i < this.getSize()-1; i++) {

            if (e.getValue() > this.get(i).getValue()) {
                return i;
            }
        }
        return i;
    }
}