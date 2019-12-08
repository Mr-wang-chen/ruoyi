package com.ruoyi.web.controller.kafka;

public class Kafkamsg {
    private  int id;
    private String No;

    public Kafkamsg(int id, String no, String name) {
        this.id = id;
        No = no;
        this.name = name;
    }

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
