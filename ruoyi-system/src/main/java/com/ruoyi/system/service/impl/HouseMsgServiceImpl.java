package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HouseMsgMapper;
import com.ruoyi.system.domain.HouseMsg;
import com.ruoyi.system.service.IHouseMsgService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-11-22
 */
@Service
public class HouseMsgServiceImpl implements IHouseMsgService 
{
    @Autowired
    private HouseMsgMapper houseMsgMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public HouseMsg selectHouseMsgById(Long id)
    {
        return houseMsgMapper.selectHouseMsgById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param houseMsg 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HouseMsg> selectHouseMsgList(HouseMsg houseMsg)
    {
        return houseMsgMapper.selectHouseMsgList(houseMsg);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param houseMsg 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHouseMsg(HouseMsg houseMsg)
    {
        return houseMsgMapper.insertHouseMsg(houseMsg);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param houseMsg 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHouseMsg(HouseMsg houseMsg)
    {
        return houseMsgMapper.updateHouseMsg(houseMsg);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteHouseMsgByIds(String ids)
    {
        return houseMsgMapper.deleteHouseMsgByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHouseMsgById(Long id)
    {
        return houseMsgMapper.deleteHouseMsgById(id);
    }
}
