package com.cc.springbootmybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cc.springbootmybatisplus.pojo.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 18:11
 * Description:
 */
public interface UserService {

    boolean insert(User entity);

    boolean deleteById(Integer id);

    boolean updateById(User entity);

    User selectById(Integer id);

    List<User> selectList();

    IPage<User> selectPage(IPage<User> page);

}
