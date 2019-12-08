package com.ruoyi.domain;


import com.ruoyi.common.core.domain.BaseEntity;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

public class equipment extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private long id;
    private String t_cityName;
    private String t_ipAddress;
    private String t_types;
    private String t_verdor;
    private Date t_time;
    private String t_urlAddress;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getT_cityName() {
        return t_cityName;
    }

    public void setT_cityName(String t_cityName) {
        this.t_cityName = t_cityName;
    }

    public String getT_ipAddress() {
        return t_ipAddress;
    }

    public void setT_ipAddress(String t_ipAddress) {
        this.t_ipAddress = t_ipAddress;
    }

    public String getT_types() {
        return t_types;
    }

    public void setT_types(String t_types) {
        this.t_types = t_types;
    }

    public String getT_verdor() {
        return t_verdor;
    }

    public void setT_verdor(String t_verdor) {
        this.t_verdor = t_verdor;
    }

    public Date getT_time() {
        return t_time;
    }

    public void setT_time(Date t_time) {
        this.t_time = t_time;
    }

    public String getT_urlAddress() {
        return t_urlAddress;
    }

    public void setT_urlAddress(String t_urlAddress) {
        this.t_urlAddress = t_urlAddress;
    }





}
