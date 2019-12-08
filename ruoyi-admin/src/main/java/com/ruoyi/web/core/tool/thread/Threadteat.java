package com.ruoyi.web.core.tool.thread;

import java.util.concurrent.locks.LockSupport;

public class Threadteat {


    public static Thread t1 =null;
    public static Thread t2 =null;
    public static void main(String[] args) {

        char arr [] = "123456789".toCharArray();
        char brr [] = "abcdefghi".toCharArray();

        t1 = new Thread(()->{
            for(char cc : arr){
                System.out.println(cc);
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        },"t1");
        t2 = new Thread(()->{
            for(char cc : brr){
                LockSupport.park();
                System.out.println(cc);
                LockSupport.unpark(t1);

            }
        },"t2");

        t1.start();
        t2.start();


    }
}
