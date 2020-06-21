package threading.threading01Basics;

public class CustomThread extends Thread {

    String name;
    Blubb blubb;
    boolean flag;

    /**
     * constructor to create new CustomThread object
     *
     * @param s defines the name of the thread
     * @param b
     * @param c
     */
    public CustomThread(String s, Blubb b, boolean c) {
        this.name = s;
        this.blubb = b;
        this.flag = c;
    }


    /* defines what the thread is supposed to do */
    public void run() {

        System.out.println("starting thread " + this.name);

        for (int i = 0; i < 5; i++) {

            if (flag) {

                blubb.first();

            } else {

                blubb.second();
            }

        }
        System.out.println("finishing thread " + this.name);
    }


}
