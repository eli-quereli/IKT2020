package uebungen.uebung02_v2;

    public class Element {

        private int data;
        private Element next;
        private Element prev;

        private Element first;
        private Element last;


        public Element(int data) {

            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Element getFirst() {

            //Gibt das jeweilige Element zurueck, das sich an der ersten Stelle der Liste befindet
           return this.get(0);
        }

        public Element getLast() {
            return this.last;
        }


        public void append(Element e) {
            if (this.next != null) {
                this.next.append(e);
            }

            else {
                this.next = e;
                e.prev = this;
                e.next = null;
            }

            //Das jeweils zuletzt eingefuegte Element wird als last gespeichert.
            this.last = e;

        }

        public Element prepend(Element e) {
            e.next = this;
            this.prev = e;
            return e;
        }

        public Element insert(Element e, int index) {
            if (index == 0) {
                return this.prepend(e);
            }
            else if (index == this.size()) {
                this.append(e);
                return this;
            }
            else if (index > this.size()) {
                throw new IndexOutOfBoundsException();
            }
            else {
                Element predecessor = this.get(index - 1);
                e.next = predecessor.next;
                predecessor.next = e;
                return this;
            }
        }

        public void remove(int index) {

            if(index < 0 || index > this.size()-1) {

                throw new IndexOutOfBoundsException();
            }

            if(index == 0) {

                this.first = this.getFirst().next;
                this.first.prev = null;
          }

           if(index == this.size()-1) {

                this.last = this.last.prev;
                this.last.next = null;
            }

           else {

            Element deleteEl = this.get(index);
            deleteEl.next.prev = deleteEl.prev;
            deleteEl.prev.next = deleteEl.next;

           }

        }


        public boolean contains(Element e) {

            while (this.hasNext()) {

                if(this.getData() == e.getData()) {
                    return true;
                }
            }
            return false;
        }


        public boolean hasNext() {
            return this.next != null;
        }



        public Element get(int index) {

            //Mit center die Mitte ermitteln, um das Feld in zwei Haelften zu teilen
            int left = 0;
            int right = this.size()-1;
            int center = this.size() / 2;

            if (index == 0) {
                return this;
            }

            //Das gesuchte Element befindet sich in der linken Haelfte
            else {

                if (index < center) {

                    return this.next.get(index-1);

                }

                //Das gesuchte Element befindet sich in der rechten Haelfte
                else {

                    //Die Liste wird von hinten durchlaufen
                    Element e = this.last;

                    for (int i = right; i > index; i--) {
                        e = e.prev;
                    }
                    return e;
                }

            }
        }


        public int getData() {
            return data;
        }

        public int size() {
            if (this.next == null) {
                return 1;
            }
            else {
                return 1 + this.next.size();
            }
        }
    }

