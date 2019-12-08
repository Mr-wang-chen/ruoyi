package com.ruoyi.web.core.tool.thread;

import java.util.concurrent.*;

public class Threads{
            public static void main(String[] args) {
                BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(10);
                ThreadPoolExecutor threadPoolExecutor =
                        new ThreadPoolExecutor(5,10,5,
                                TimeUnit.SECONDS,new SynchronousQueue<Runnable>(), new ThreadPoolExecutor.AbortPolicy());
                ThreadPoolExecutor threadPoolExecutors =
                        new ThreadPoolExecutor(5,10,5,
                                TimeUnit.SECONDS,queue, new ThreadPoolExecutor.AbortPolicy());
                threadPoolExecutors.execute(new Task());
                System.out.println(11);
            }


}
