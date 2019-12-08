package com.ruoyi.web.controller.common;

import com.ruoyi.web.controller.kafka.KafkaProducer;
import com.ruoyi.web.controller.kafka.Kafkamsg;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Component
public class Scheduler {

    public  static  int i = 0;;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 600000)
    public void testTasks() {
        Kafkamsg msgi =  new Kafkamsg(++i,dateFormat.format(new Date()),"chen");
        List<Kafkamsg> ls = new ArrayList<Kafkamsg>(2);
        ls.add(msgi);
        System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
        KafkaProducer kfkp = new KafkaProducer(ls);
        Thread t = new Thread(kfkp);
        t.start();

    }

}
