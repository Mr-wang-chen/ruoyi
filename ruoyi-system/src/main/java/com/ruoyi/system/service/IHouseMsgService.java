package com.ruoyi.system.service;

import com.ruoyi.system.domain.HouseMsg;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2019-11-22
 */
public interface IHouseMsgService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HouseMsg selectHouseMsgById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param houseMsg 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HouseMsg> selectHouseMsgList(HouseMsg houseMsg);

    /**
     * 新增【请填写功能名称】
     * 
     * @param houseMsg 【请填写功能名称】
     * @return 结果
     */
    public int insertHouseMsg(HouseMsg houseMsg);

    /**
     * 修改【请填写功能名称】
     * 
     * @param houseMsg 【请填写功能名称】
     * @return 结果
     */
    public int updateHouseMsg(HouseMsg houseMsg);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHouseMsgByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHouseMsgById(Long id);
}
