package com.xxx.seckill.vo;

//公共返回对象枚举

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum  RespBeanEnum {
    //通用状态码
    SUCCESS(200,"success"),
    ERROR(500,"服务端异常"),
    //登录模块5002xx
    SESSION_ERROR(500210,"session不存在或者已经失效"),
    LOGINVO_ERROR(500211,"用户名或者密码错误"),
    MOBILE_ERROR(500212,"手机号码格式错误"),
    BIND_ERROR(500213,"参数校验异常"),
    MOBILE_NOT_EXIST(500214, "手机号码不存在"),
    PASSWORD_UPDATE_FAIL(500215, "密码更新失败"),
    // 秒杀模块 505xxx
    EMPTY_STOCK(505213,"库存不足"),
    REPEATE_ERROR(505214,"该商品每人限购一件"),
    REQUEST_ILLEGAL(505502,"请求非法"),
    ERROR_CAPTCHA(505503,"验证码错误"),
    // 订单模块503xxx
    ORDER_NOT_EXIST(503000,"订单信息不存在")
    ;

    private final Integer code;
    private final String message;
}
