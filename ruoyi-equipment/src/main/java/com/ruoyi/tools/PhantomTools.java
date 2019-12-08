package com.ruoyi.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PhantomTools {
    private static String tempPath = "D:";// 图片保存目录
    private static String BLANK = " ";
    // 下面内容可以在配置文件中配置
    private static String binPath = "D:/bar/phantomjs-2.1.1-windows/bin/phantomjs.exe";// 插件引入地址
    private static String jsPath =  "D:/bar/phantomjs-2.1.1-windows/examples/rasterize.js";// js引入地址
    private static int total = 1;
    // 执行cmd命令
    public static String cmd(String imgagePath, String url) {
        return binPath + BLANK + jsPath + BLANK + url + BLANK + imgagePath;
    }
    //关闭命令
    public static void close(Process process, BufferedReader bufferedReader) throws IOException {
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        if (process != null) {
            process.destroy();
            process = null;
        }
    }
    /**
     * @param
     * @param url
     * @throws IOException
     */
    public static void printUrlScreen2jpg(String url,String name,int count) throws IOException{
        String imgagePath = tempPath+"/"+"11/picture/"+name+".png";//图片路径
        //Java中使用Runtime和Process类运行外部程序
        Process process = Runtime.getRuntime().exec(cmd(imgagePath,url));
        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        //String tmp = "";
        if(count==total){
            while (( reader.readLine()) != null) {
                close(process,reader);
            }
        }else{
            total++;
        }

        //System.out.println("success");
    }
    public static  void closeio(){

    }
    public static void main(String[] args) throws IOException {
        //String url = "https://www.baidu.com/";//以百度网站首页为例
        String [] url = {"https://www.baidu.com/","https://eos-beijing-2.cmecloud.cn/","xhttps://eos-beijing-2.cmecloud.cn/"};
        for(int i = 0 ;i<3;i++){
            PhantomTools.printUrlScreen2jpg(url[i],i+"",3);
        }

    }
}
