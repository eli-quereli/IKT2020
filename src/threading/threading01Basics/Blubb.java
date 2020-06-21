package threading.threading01Basics;

public class Blubb {

    boolean flag = false;

    public synchronized void first(){

        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("I am the first thread");
        flag = true;
        notify();
    }


    public synchronized void second(){

        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("I am the second thread");
        flag = false;
        notify();


    }

    public Blubb() {

    }



}
