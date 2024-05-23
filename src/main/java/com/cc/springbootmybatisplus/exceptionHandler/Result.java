package com.cc.springbootmybatisplus.exceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 19:18
 * Description:
 */

// 用于封装响应结果
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    //描述统一格式中的数据: 返回的对象
    private Object data;
    //描述统一格式中的编码，用于区分操作，可以简化配置0或1表示成功失败
    private Integer code;
    //描述统一格式中的消息
    private String msg;
}
/* 使用：controller层UserController.java类add(User user)方法 */
