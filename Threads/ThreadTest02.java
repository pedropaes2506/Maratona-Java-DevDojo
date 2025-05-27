package Threads;

class ThreadExampleRunnable1 implements Runnable  {
    private char c;

    public ThreadExampleRunnable1(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable1('A'));
        Thread t2 = new Thread(new ThreadExampleRunnable1('B'));
        Thread t3 = new Thread(new ThreadExampleRunnable1('C'));
        Thread t4 = new Thread(new ThreadExampleRunnable1('D'));

        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        System.out.println("#################" + Thread.currentThread().getName());
    }
}
