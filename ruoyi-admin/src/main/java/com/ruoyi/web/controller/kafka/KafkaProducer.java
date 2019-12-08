package com.ruoyi.web.controller.kafka;


import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import net.sf.json.JSONArray;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
public class KafkaProducer implements  Runnable{

        private List<Kafkamsg> list;
        public KafkaProducer(List<Kafkamsg> list){
            this.list = list;
        }
        @Override
        public void run() {
          /*  while(true) {
                KafkaProducer.sendMessage(list ,"today20191106");
                System.out.println("Sent: " + list.get(0).toString());
                try{
                    Thread.sleep(2000);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }*/
        }

        public static void sendMessage(List<Kafkamsg> list, String topic){
            Properties properties = new Properties();
            properties.put("metadata.broker.list",KafkaProperties.BROKER_LIST);
            properties.put("serializer.class","kafka.serializer.StringEncoder");
            properties.put("request.required.acks","1");
            Producer<String, String> producer = new Producer<String,String>(new ProducerConfig(properties));
            JSONArray js = JSONArray.fromObject(list);
            System.out.println(js.toString());
            producer.send(new KeyedMessage<String, String>(topic, js.toString()));
            producer.close();
        }


}
