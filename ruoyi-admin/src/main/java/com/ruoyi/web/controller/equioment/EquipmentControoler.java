package com.ruoyi.web.controller.equioment;


import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.domain.equipment;
import com.ruoyi.service.equipmentService;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.web.core.tool.RedisUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/equipment/equipment")
public class EquipmentControoler extends BaseController {
    private String prefix = "equipment";

    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private equipmentService equipmentService;
    @RequiresPermissions("equipment:view")
    @GetMapping()
    public String equipment()
    {
        return prefix + "/equipment";
    }


    @RequiresPermissions("equipment:view")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(equipment user)
    {
        startPage();
        List<equipment> list = new ArrayList<equipment>();
        if(redisUtil.hasKey(user.toString())){
            long size = redisUtil.lGetListSize(user.toString());
            System.out.println(size);
            List<Object> olist = redisUtil.lGet(user.toString(),0l,-1);
            for(int i = 0 ; i<size;i++){
                list.add((equipment)olist.get(i));
            }
        }else{
            list = equipmentService.findEquipment(user);
            redisUtil.lSet(user.toString(),list);
        }

        return getDataTable(list);
    }
}
