package com.gausscode.competitiveanalysis.core;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer code;

    private final String message;

    private final T payload;

    private ApiResponse(Integer code, String message) {
        this(code, message, null);
    }

    private ApiResponse(Integer code, String message, T payload) {
        this.code = code;
        this.message = message;
        this.payload = payload;
    }

    /**
     * 成功不带返回参数
     *
     * @return ApiResponse
     */
    public static <T> ApiResponse<T> success() {
        return success();
    }

    /**
     * 成功加返回参数
     *
     * @param payload 结果
     * @param <T>     Class
     * @return ApiResponse
     */
    public static <T> ApiResponse<T> success(T payload) {
        return new ApiResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(), payload);
    }

    public static <T> ApiResponse<T> fail() {
        return fail(ResponseCode.FAILURE);
    }

    public static <T> ApiResponse<T> fail(ResponseCode code) {
        return fail(code.getCode(), code.getMessage());
    }

    public static <T> ApiResponse<T> fail(Integer code, String message) {
        return new ApiResponse<>(code, message);
    }

    public static <T> ApiResponse<T> error() {
        return error(ResponseCode.ERROR);
    }

    public static <T> ApiResponse<T> errorWithNull() {
        return error(ResponseCode.PARAM_ERROR_EMPTY);
    }

    public static <T> ApiResponse<T> error(ResponseCode code) {
        return error(code.getCode(), code.getMessage());
    }

    public static <T> ApiResponse<T> error(Integer code, String message) {
        return new ApiResponse<>(code, message);
    }

}