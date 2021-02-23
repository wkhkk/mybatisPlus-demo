package com.mybatisplus.demo.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatisplus.demo.mybatisplus.dao.User;
import com.mybatisplus.demo.mybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: $
 * @Author: wangkai
 * @date: $
 */
@RestController
@RequestMapping
public class MybatisDemo {

    @Autowired
    private UserMapper userMapper;

    /**
     * selectList(null)：无条件，查询所有
     * */
    @RequestMapping("test")
    public String demo1(){
        String ret = "";
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            ret += user.toString()+" <br/>";
        }
        return ret;
    }

    /**
     * 传对象指定条件查询
     */
    @RequestMapping("test2")
    public String demo2(){
        String ret = "";
        User param = new User();
        param.setId(11L);
        List<User> users = userMapper.selectList(new QueryWrapper<>(param));
        for (User user : users) {
            ret += user.toString()+" <br/>";
        }
        return ret;
    }
    /**
     * 传对象查询和 .eq  查询条件共同生效
     * 查询列：.select 优先级高于 new QueryWrapper传递的列
     */
    @RequestMapping("test3")
    public String demo3(){
        String ret = "";
        User param = new User();
        param.setId(11L);
        List<User> users = userMapper.selectList(new QueryWrapper<>(param,"ID","user_name")
                .select("we_Chat_Name")
                .eq("id","12"));
        for (User user : users) {
            ret += user.toString()+" <br/>";
        }
        return ret;
    }
}
