package com.ruoyi.web.core.tool.thread;

public class Task implements Runnable {
    private static  volatile int i = 0;
    @Override
    public void run() {
            increace();

    }
    public void increace(){
        for(int j = 0 ;j<10;j++){
            i += 2;
            System.out.print(Thread.currentThread().getName());
            System.out.println("  "+i);
        }

    }
}
