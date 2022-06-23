package com.xxoo.common;

import com.xxoo.enums.ApiResultCodeEnum;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ApiResult {
    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<>();

    // 构造器私有
    private ApiResult(){}

    // 通用返回成功
    public static ApiResult ok() {
        ApiResult apiResult = new ApiResult();
        apiResult.setSuccess(ApiResultCodeEnum.SUCCESS.getSuccess());
        apiResult.setCode(ApiResultCodeEnum.SUCCESS.getCode());
        apiResult.setMessage(ApiResultCodeEnum.SUCCESS.getMessage());
        return apiResult;
    }

    // 通用返回失败，未知错误
    public static ApiResult error() {
        ApiResult apiResult = new ApiResult();
        apiResult.setSuccess(ApiResultCodeEnum.UNKNOWN_ERROR.getSuccess());
        apiResult.setCode(ApiResultCodeEnum.UNKNOWN_ERROR.getCode());
        apiResult.setMessage(ApiResultCodeEnum.UNKNOWN_ERROR.getMessage());
        return apiResult;
    }

    // 设置结果，形参为结果枚举
    public static ApiResult setResult(ApiResultCodeEnum result) {
        ApiResult apiResult = new ApiResult();
        apiResult.setSuccess(result.getSuccess());
        apiResult.setCode(result.getCode());
        apiResult.setMessage(result.getMessage());
        return apiResult;
    }

    /**------------使用链式编程，返回类本身-----------**/

    // 自定义返回数据
    public ApiResult data(Map<String,Object> map) {
        this.setData(map);
        return this;
    }

    // 通用设置data
    public ApiResult data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    // 自定义状态信息
    public ApiResult message(String message) {
        this.setMessage(message);
        return this;
    }

    // 自定义状态码
    public ApiResult code(Integer code) {
        this.setCode(code);
        return this;
    }

    // 自定义返回结果
    public ApiResult success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

}
