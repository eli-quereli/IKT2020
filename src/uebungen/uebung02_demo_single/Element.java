package uebungen.uebung02_demo_single;

    public class Element {

        private int data;
        private Element next;
        private Element prev;

        public Element(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public void append(Element e) {
            if (this.next != null) {
                this.next.append(e);
            }
            else {
                this.next = e;
                e.next = null;
            }
        }

        public Element prepend(Element e) {
            e.next = this;
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

        public Element get(int index) {
            if (index == 0) {
                return this;
            }
            else {
                return this.next.get(index - 1);
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

