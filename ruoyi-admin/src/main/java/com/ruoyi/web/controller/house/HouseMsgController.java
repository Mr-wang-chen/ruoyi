package com.ruoyi.web.controller.house;


import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.HouseMsg;
import com.ruoyi.system.service.IHouseMsgService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.core.controller.BaseController;

import java.util.List;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/system/msg")
public class HouseMsgController extends BaseController
{
    private String prefix = "house";

    @Autowired
    private IHouseMsgService houseMsgService;

    @RequiresPermissions("system:msg:view")
    @GetMapping()
    public String msg()
    {
        return prefix + "/house_msg";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @Log(title = "查詢房产信息", businessType = BusinessType.EXPORT)
    @RequiresPermissions("system:msg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(HouseMsg houseMsg)
    {
        startPage();
        List<HouseMsg> list = houseMsgService.selectHouseMsgList(houseMsg);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:msg:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HouseMsg houseMsg)
    {
        List<HouseMsg> list = houseMsgService.selectHouseMsgList(houseMsg);
        ExcelUtil<HouseMsg> util = new ExcelUtil<HouseMsg>(HouseMsg.class);
        return util.exportExcel(list, "msg");
    }

    /**
     * 新增【请填写功能名称】
     */
    @RequiresPermissions("system:msg:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:msg:add")
    @Log(title = "【新添房产信息】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(HouseMsg houseMsg)
    {
        return toAjax(houseMsgService.insertHouseMsg(houseMsg));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        HouseMsg houseMsg = houseMsgService.selectHouseMsgById(id);
        mmap.put("houseMsg", houseMsg);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:msg:edit")
    @Log(title = "【修改房产信息】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(HouseMsg houseMsg)
    {
        return toAjax(houseMsgService.updateHouseMsg(houseMsg));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:msg:remove")
    @Log(title = "【删除房产信息】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(houseMsgService.deleteHouseMsgByIds(ids));
    }
}
