package com.ruoyi.web.core.tool.singleton;

public class SingleTon {

    private static volatile SingleTon singleton;
    private  SingleTon(){}
    public static SingleTon SingleTon(){
        if(singleton==null){
            synchronized (SingleTon.class){
                if(singleton==null){
                    singleton =new SingleTon();
                }
            }
        }
        return  singleton;
    }

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            new Thread(()->{
                System.out.println(SingleTon.SingleTon().hashCode());
            }).start();

        }
    }
}
