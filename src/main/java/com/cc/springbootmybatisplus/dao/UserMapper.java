package com.cc.springbootmybatisplus.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cc.springbootmybatisplus.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 17:25
 * Description:
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
    // MybatisPlus
    /*
    1、无侵入：只做增强不做改变，不会对现有工程产生影响
    2、强大的CRUD操作：内置通用Mapper，少量配置即可实现单表CRUD操作
    3、支持Lambda：编写查询条件无需担心字段写错
    4、支持主键自动生成
    5、内置分页插件
    */

    // 标准CRUD、分页

    @Override
    int insert(User entity);

    @Override
    int deleteById(Serializable id);

    @Override
    int updateById(User entity);

    @Override
    User selectById(Serializable id);

    List<User> selectList();

    IPage<User> selectPage(IPage<User> page);

    // Mybatis多表联查分页
    /*
    方式1：使用注解@Select("sql语句")
    方式2：配置mapper.xml文件，在xml中写分页多表查询语句（同Mybatis）
    */

    @Select("分页多表查询语句")
    List<User> selectPage(Integer size, Integer pageNo);


}
