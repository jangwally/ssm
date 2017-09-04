package com.loe.service;

import com.loe.dao.CategoryMapper;
import com.loe.entity.Category;
import com.loe.entity.Detial;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class CategoryServiceImpl implements CategorySerivcce {
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private DetailService detailService;


    @Override
    @Transactional
    public int addDetailAndCategory(Category category) {
        categoryMapper.insert(category);
        Detial detial=new Detial();
        detial.setTitle("事务测试新闻标题");
        detial.setCreatedate(new Date());
        detial.setCategoryid(category.getId());
        detial.setId(1);
        detailService.addDetail(detial);
        return 0;
    }
}
