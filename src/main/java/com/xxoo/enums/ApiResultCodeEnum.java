package com.xxoo.enums;

import lombok.Getter;

@Getter
public enum ApiResultCodeEnum {

    SUCCESS(true,20000,"成功"),
    UNKNOWN_ERROR(false,20001,"未知错误"),
    PARAM_ERROR(false,20002,"参数错误"),
    HTTP_CLIENT_ERROR(false,5000,"Http请求异常"),
    NULL_POINT(false,3000,"空指针异常"),
    ;

    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ApiResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

}
