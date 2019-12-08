package com.ruoyi.service.impl;

import com.ruoyi.domain.equipment;
import com.ruoyi.mapper.equipmentMapper;
import com.ruoyi.service.equipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IequipmentService implements equipmentService {

    @Autowired
    private com.ruoyi.mapper.equipmentMapper equipmentMapper;

    @Override
    public List<equipment> findEquipment(equipment eq) {
        return equipmentMapper.findEquipment(eq);
    }
}
