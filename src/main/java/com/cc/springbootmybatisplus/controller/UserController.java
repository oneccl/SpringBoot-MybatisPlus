package com.cc.springbootmybatisplus.controller;

import com.cc.springbootmybatisplus.exceptionHandler.Result;
import com.cc.springbootmybatisplus.pojo.User;
import com.cc.springbootmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 18:11
 * Description:
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    // 添加
    @RequestMapping("add.do")
    public Result add(@RequestBody User user){
        boolean res = userService.insert(user);
        // 返回封装的响应结果对象
        if (res){
            return new Result(true, HttpServletResponse.SC_OK,"添加成功!");
        }else {
            return new Result(false, 3333,"添加失败!请重试!");
        }
    }

    // 根据id查询
    @RequestMapping("findById.do")
    public Object findById(Integer id){
        return userService.selectById(id);
    }

}
