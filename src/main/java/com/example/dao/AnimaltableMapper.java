package com.example.dao;

import java.util.List;

import com.example.po.AnimaltablePO;

public interface AnimaltableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AnimaltablePO record);

    int insertSelective(AnimaltablePO record);

    AnimaltablePO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AnimaltablePO record);

    int updateByPrimaryKey(AnimaltablePO record);
    
    List<AnimaltablePO> getAll();
}