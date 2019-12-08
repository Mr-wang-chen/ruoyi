package com.ruoyi.web.core.tool.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTests {

    static Thread t1 = null;
    static Thread t2 = null;
    static int i = 0 ;
    public static void main(String[] args) {
        char arr[] = "123456789".toCharArray();
        char brr[] = "abcdefghi".toCharArray();
        Lock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        t1 = new Thread(()->{
               try {
                   lock.lock();
                   for(char a :arr){
                       System.out.println(a);
                       condition2.signal();
                       condition1.await();
                   }
                   condition1.signal();
               }catch (InterruptedException e){
                   e.printStackTrace();
               }finally {
                   lock.unlock();
               }


        },"t1");
        t2 = new Thread(()->{
            lock.lock();
            try{
                for(char a :brr){
                    System.out.println(a);
                    condition1.signal();//唤醒锁
                    condition2.await(); //等待锁
                }
                condition2.signal();
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }


        },"t2");
        t1.start();
        t2.start();

    }
}
