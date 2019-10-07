package ThreadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    Lock lock = new ReentrantLock();

    public void lockTest(Thread thread){

        lock.lock();
        System.out.println("当前线程的名字:"+thread.getName()+"获取锁");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("当前线程名字"+thread.getName()+"发生异常");
        }
        finally {

            System.out.println("当前线程的名字:"+thread.getName()+"释放锁");
            lock.unlock();
        }


    }
    public void tryLock(Thread thread){
        if(lock.tryLock()){
            try {
                System.out.println("当前线程名字"+thread.getName()+"获取锁");
                Thread.sleep(2000);
                }

             catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(thread.getName()+"释放锁");
                lock.unlock();
            }
        }
          else{
            System.out.println("我是线程:"+thread.getName()+"没有申请到锁");
        }
    }

/*    public static void main(String[] args) {

        ThreadTestDemo1 ttd = new ThreadTestDemo1();

        Thread t1 = new Thread(ttd);
        Thread t2 = new Thread(ttd);
        t1.start();
        t2.start();

    }*/
}
