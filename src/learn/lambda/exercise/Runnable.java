package learn.lambda.exercise;

public class Runnable {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
               System.out.println("Printed inside Runnable");
           }
        });

        myThread.start();
    }
}
