package com.cc.springbootmybatisplus.exceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 19:40
 * Description:
 */

// 全局异常处理器

// @RestControllerAdvice：用于标识当前类为REST风格对应的异常处理器
// 该注解自带@ResponseBody注解与@Component注解，具备对应的功能
@RestControllerAdvice
public class GlobalExceptionAdvice {

    // 统一处理所有的Exception异常
    // @ExceptionHandler用于设置当前处理器处理的异常类型
    // 该注解表示项目出现异常后终止原始控制器执行，并转入当前方法执行
    @ExceptionHandler(Exception.class)
    public Result doAllException(Exception e){
        return new Result(null,9999,"服务维护中...请稍后访问!");
    }

}
