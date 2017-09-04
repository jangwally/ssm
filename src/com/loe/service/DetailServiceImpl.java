package com.loe.service;

import com.loe.dao.DetialMapper;
import com.loe.entity.Detial;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class DetailServiceImpl implements DetailService {

    @Resource
    private DetialMapper detialMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addDetail(Detial detial) {
        detialMapper.insertSelective(detial);
        return 0;
    }
}
