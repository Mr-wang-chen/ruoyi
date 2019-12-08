package com.ruoyi.web.core.tool.hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Gethash {

    public static void main(String[] args) {

        //创建集合
        Map<String, String> map = new HashMap<String, String>();
        map.put("邓超", "孙俪");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "昆凌");
        map.put("刘恺威", "杨幂");
        map.put("刘恺威", "杨幂1");

        //V get(Object key):根据键获取值
        System.out.println("get：" + map.get("周杰伦"));
        System.out.println("周杰伦".hashCode());
    }
}
