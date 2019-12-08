package com.ruoyi.web.controller.kafka;

public class KafkaProperties {
    public static final String ZK = "140.143.162.170:2181";   //此处要和kafka配置文件中的 advertised.host.name保持一致，要么都是IP,
    public static final String TOPIC = "hello_topic";
    public static final String BROKER_LIST = "140.143.162.170:9092";
    public static final String GROUP_ID = "test_group1";
}
