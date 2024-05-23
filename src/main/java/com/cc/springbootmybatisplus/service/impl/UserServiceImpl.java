package com.cc.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cc.springbootmybatisplus.dao.UserMapper;
import com.cc.springbootmybatisplus.exceptionHandler.BusinessException;
import com.cc.springbootmybatisplus.pojo.User;
import com.cc.springbootmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 18:14
 * Description:
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean insert(User entity) {
        return userMapper.insert(entity) > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return userMapper.deleteById(id) > 0;
    }

    @Override
    public boolean updateById(User entity) {
        return userMapper.updateById(entity) > 0;
    }

    @Override
    public User selectById(Integer id){
        // 模拟业务异常
        if (id < 0){
            throw new BusinessException(8888,"系统繁忙!");
        }
        return userMapper.selectById(id);
    }

    @Override
    public List<User> selectList() {
        return userMapper.selectList();
    }

    @Override
    public IPage<User> selectPage(IPage<User> page) {

        return userMapper.selectPage(page);
    }


}
