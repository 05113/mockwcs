
package ThreadTest;

/*
public class ThreadTestDemo1 implements  Runnable{

    private static int ticket = 100;
    @Override
    public void  run() {

            try {
                for (int i = 0; i < 100; i++) {

                        Thread.sleep(3000);
                        if (ticket > 0) {
                            synchronized (this) {
                            System.out.println(Thread.currentThread().getName() + "卖票:" + ticket--);
                        }
                    }
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    public static void main(String[] args) {
        ThreadTestDemo1 td = new ThreadTestDemo1();
        Thread t1 = new Thread(td);
        Thread t2 = new Thread(td);
        Thread t3 = new Thread(td);
        Thread t4 = new Thread(td);
        Thread t5 = new Thread(td);
        Thread t6 = new Thread(td);
        Thread t7 = new Thread(td);
        Thread t8 = new Thread(td);
        Thread t9 = new Thread(td);
        Thread t10 = new Thread(td);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
*/

/*
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTestDemo1 implements  Runnable {
    private static  int ticket = 1000;
    Lock lock=new ReentrantLock();
    public static  void sell(){
        System.out.println(Thread.currentThread().getName() + "----sell:" + ticket);
        ticket=ticket-1;
    }

    @Override
    public void run() {
        try {
            while (true){
                Thread.sleep(3000);
                if (ticket > 0) {
                    lock.lock();
                    sell();
                    lock.unlock();

                }
            }

        }catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

    public static void main(String[] args) {
        ThreadTestDemo1 td = new ThreadTestDemo1();
        Thread t1 = new Thread(td);
        Thread t2 = new Thread(td);
        Thread t3 = new Thread(td);
        Thread t4 = new Thread(td);
        Thread t5 = new Thread(td);
        Thread t6 = new Thread(td);
        Thread t7 = new Thread(td);
        Thread t8 = new Thread(td);
        Thread t9 = new Thread(td);
        Thread t10 = new Thread(td);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}*/

public class ThreadTestDemo1 implements  Runnable{

    LockTest lt = new LockTest();
    @Override
    public void run() {
        lt.tryLock(Thread.currentThread());
    }
}
