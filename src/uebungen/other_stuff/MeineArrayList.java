package uebungen.other_stuff;

import java.util.Arrays.*;

/**
 * a very simplified version of java.util.ArrayList 
 *
 * @param <E>
 */


public class MeineArrayList<E> {
	 private E[] list;
	 private int size;
	 private int capacity;
	 private int increment;
	 
/**
 * constructs a MeineArrayList-Object with initial capacity c
 * and increment inc
 * @param c the initial capacity
 * @param inc the number of positions that will be added
 * when the list is made bigger
 */
      public MeineArrayList(int c, int inc) {
          capacity = c;
          list = (E[]) new Object[c];
          size = 0;
         increment = inc;
      }


    /**
     * appends elements to MeineArrayList-Object with increment inc
     * @param inc the number of elements to be appended
     * @return
     */
    public MeineArrayList appendElements(int inc) {




          this.size += inc;
          return this;



    }


    public MeineArrayList insertElements(int pos, int inc) {

        return this;

    }


    public MeineArrayList prependElements(int inc) {


        return this;

    }

    public MeineArrayList deleteElements(int decr) {

          //java.util.Arrays.copyOf()
          //System.arraycopy();

          this.size -= decr;
          return this;

    }

    public MeineArrayList deleteAll() {


          this.size = 0;
          return this;
    }


    public int size() {

          return this.size;

    }


    @Override
    public String toString() {

          String s = "Meine ArrayList: ";

          for (int i = 0; i < this.size(); i++) {

           //.toString();

        }

          return s;

        }


}




