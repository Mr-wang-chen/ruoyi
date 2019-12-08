package com.ruoyi.web.core.tool.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.LockSupport;

public class ThreadTest {

    public static  int i = 0;
    public static  int k = 0;
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(1);
        char arr [] = "123456789".toCharArray();
        char brr [] = "abcdefghi".toCharArray();
        Object o = new Object();
        new Thread(()->{
                    synchronized (o){
                        try{
                            cdl.await();
                        }
                        catch (InterruptedException e){
                        }
                        for(char c:arr){
                            System.out.println(c);
                            try{
                                o.notify();
                                o.wait();
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                        o.notify();
                    }
                }
                ).start();
        new Thread(()->{
            synchronized (o){
                cdl.countDown();
                while(i<brr.length){
                    System.out.println(brr[i]);
                    i++;
                    try {
                        o.notify();
                        o.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }
        ).start();
    }

}
