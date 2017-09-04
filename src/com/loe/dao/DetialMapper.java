package com.loe.dao;

import com.loe.entity.Detial;

public interface DetialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Detial record);

    int insertSelective(Detial record);

    Detial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Detial record);

    int updateByPrimaryKeyWithBLOBs(Detial record);

    int updateByPrimaryKey(Detial record);
}