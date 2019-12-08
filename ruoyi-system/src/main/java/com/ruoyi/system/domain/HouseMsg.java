package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 house_msg
 * 
 * @author ruoyi
 * @date 2019-11-22
 */
public class HouseMsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 房子名称 */
    @Excel(name = "房子名称")
    private String houseName;

    /** $column.columnComment */
    @Excel(name = "房子名称")
    private String houseImg;

    /** 房子类型：商品房，自建房 */
    @Excel(name = "房子类型：商品房，自建房")
    private String houseType;

    /** $column.columnComment */
    @Excel(name = "房子类型：商品房，自建房")
    private String houseAddress;

    /** $column.columnComment */
    @Excel(name = "房子类型：商品房，自建房")
    private String houseRoomcount;

    /** $column.columnComment */
    @Excel(name = "房子类型：商品房，自建房")
    private String houseSize;

    /** $column.columnComment */
    @Excel(name = "房子类型：商品房，自建房")
    private String houseState;

    /** 联系人 */
    @Excel(name = "联系人")
    private String houseContacts;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHouseName(String houseName) 
    {
        this.houseName = houseName;
    }

    public String getHouseName() 
    {
        return houseName;
    }
    public void setHouseImg(String houseImg) 
    {
        this.houseImg = houseImg;
    }

    public String getHouseImg() 
    {
        return houseImg;
    }
    public void setHouseType(String houseType) 
    {
        this.houseType = houseType;
    }

    public String getHouseType() 
    {
        return houseType;
    }
    public void setHouseAddress(String houseAddress) 
    {
        this.houseAddress = houseAddress;
    }

    public String getHouseAddress() 
    {
        return houseAddress;
    }
    public void setHouseRoomcount(String houseRoomcount) 
    {
        this.houseRoomcount = houseRoomcount;
    }

    public String getHouseRoomcount() 
    {
        return houseRoomcount;
    }
    public void setHouseSize(String houseSize) 
    {
        this.houseSize = houseSize;
    }

    public String getHouseSize() 
    {
        return houseSize;
    }
    public void setHouseState(String houseState) 
    {
        this.houseState = houseState;
    }

    public String getHouseState() 
    {
        return houseState;
    }
    public void setHouseContacts(String houseContacts) 
    {
        this.houseContacts = houseContacts;
    }

    public String getHouseContacts() 
    {
        return houseContacts;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("houseName", getHouseName())
            .append("houseImg", getHouseImg())
            .append("houseType", getHouseType())
            .append("houseAddress", getHouseAddress())
            .append("houseRoomcount", getHouseRoomcount())
            .append("houseSize", getHouseSize())
            .append("houseState", getHouseState())
            .append("houseContacts", getHouseContacts())
            .toString();
    }
}
