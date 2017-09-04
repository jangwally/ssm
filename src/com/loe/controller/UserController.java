package com.loe.controller;

import com.loe.dao.UserMapper;
import com.loe.entity.Category;
import com.loe.entity.Detial;
import com.loe.entity.User;
import com.loe.service.CategorySerivcce;
import com.loe.service.DetailService;
import com.loe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.xml.soap.Detail;
import java.util.Date;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private DetailService detailService; // @Autowired和  @Resource 注解功能相同。
    @Resource
    private CategorySerivcce categorySerivcce;
    @RequestMapping("/user1")
    public String findUser(){
        System.out.println("test git !");
        return "user1";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) throws Exception {
        userService.addUser(user);

        return "user1";
    }

    @RequestMapping("/addNewsDetailWithCategory")
    public String addNewsDetailWithCategory(@RequestBody Category category){
        categorySerivcce.addDetailAndCategory(category);
        return "user1";
    }
    @RequestMapping("/addNewsDetail")
    public String addNewsDetail(){
        Detial detial=new Detial();
        detial.setTitle("事务测试新闻标题1");
        detial.setCreatedate(new Date());
        detial.setCategoryid(1);
        detailService.addDetail(detial);
        return "user1";
    }
}
