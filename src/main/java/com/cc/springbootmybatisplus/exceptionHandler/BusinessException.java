package com.cc.springbootmybatisplus.exceptionHandler;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/7
 * Time: 20:03
 * Description:
 */

// 例如：自定义业务异常处理器，用于封装异常信息，对异常进行分类（其它异常定义类似）
/* 触发自定义异常: service层selectById(Integer id)方法 */
public class BusinessException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }
    public BusinessException(Integer code,String message,Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
