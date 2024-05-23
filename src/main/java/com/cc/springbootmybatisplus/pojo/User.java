package com.cc.springbootmybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 17:49
 * Description:
 */

@Data
// @Data用于
/*
生成getter和setter方法：@Getter、@Setter
生成toString方法：@ToString
生成equals和hashcode方法：@EqualsAndHashCode
*/
@AllArgsConstructor
@NoArgsConstructor

@TableName("user")  // 数据库表名
public class User {
    /*
    id为Long类型，数据库中id为bigint类型，mybatis有自己的一套id生成方案，生成的id必须是Long类型
    */
    @TableId(type=IdType.AUTO) // 自增
    private Long id;
    private String name;
    // 如果表字段与类属性名不一致
    @TableField(value = "pwd",select = false)  // 字段名，select：设置该属性是否参与查询
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)  // 表示online字段不参与CRUD操作
    private Boolean online;

}
