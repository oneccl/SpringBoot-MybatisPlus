package com.cc.springbootmybatisplus.exceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 19:48
 * Description:
 */

// @RestControllerAdvice：用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ExceptionHandlingAdvice {
    // 项目异常处理方案

    // 异常分类及处理方案
    /*
    1、业务异常（BusinessException）:用户行为操作产生的异常
    处理：发送对应消息传递给用户，提醒规范操作
    2、系统异常（SystemException）:项目运行过程中可预计且无法避免的异常
    处理：发送固定消息传递给用户，安抚用户；发送特定消息给运维人员，提醒维护；记录日志
    3、其他异常（Exception）:编程人员未预期到的异常
    处理：发送固定消息传递给用户，安抚用户；发送特定消息给编程人员，提醒维护（纳入预期范围内）；记录日志
    */

    // 业务异常
    // @ExceptionHandler用于设置当前处理器处理的异常类型
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        return new Result(null,e.getCode(),e.getMessage());
    }

    // 其它异常(全局异常处理)
    // 用于处理非预期的异常
    @ExceptionHandler(Exception.class)
    public Result doOtherException(Exception ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        return new Result(null,7777,"系统繁忙，请稍后再试！");
    }

}
// 自定义业务异常处理器，用于封装异常信息，对异常进行分类（系统异常定义类似）
/*   触发自定义异常: service层selectById(Integer id)方法   */
// BusinessException.java类