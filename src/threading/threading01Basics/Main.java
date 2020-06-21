package threading.threading01Basics;

public class Main {


    public static void main(String[] args) {

        Blubb b = new Blubb();
        Integer counter = 0;

        CustomThread t1 = new CustomThread("nr 1", b, true);
        CustomThread t2 = new CustomThread("nr 2", b, false);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end of code execution");
    }


}
