package singleton;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Singleton1 s;
        for (int i=0; i<1000; i++){
            s = Singleton1.getInstance();
        }

        System.out.println(Singleton1.count);


        //*****   Multithreading    *******

        final int SIZE = 1000;

        Thread t[] = new Thread[SIZE];

        for (int j = 0; j<SIZE; j++){
            t[j] = new Thread(new R());
            t[j].start();
        }

        for (int j = 0; j<SIZE; j++){
            t[j].join();
        }

        System.out.println(Singleton1.count);
    }
}

class R implements Runnable{
    @Override
    public void run() {
       Singleton1.getInstance();
    }
}
