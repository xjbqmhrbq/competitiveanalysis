package technology.cariad.app.competitiveanalysis.core;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer code;

    private final String message;

    private final T payload;

    private Result(Integer code, String message) {
        this(code, message, null);
    }

    private Result(Integer code, String message, T payload) {
        this.code = code;
        this.message = message;
        this.payload = payload;
    }

    /**
     * 成功不带返回参数
     *
     * @return ApiResponse
     */
    public static <T> Result<T> success() {
        return success();
    }

    /**
     * 成功加返回参数
     *
     * @param payload 结果
     * @param <T>     Class
     * @return ApiResponse
     */
    public static <T> Result<T> success(T payload) {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), payload);
    }

    public static <T> Result<T> fail() {
        return fail(ResultCode.FAILURE);
    }

    public static <T> Result<T> fail(ResultCode code) {
        return fail(code.getCode(), code.getMessage());
    }

    public static <T> Result<T> fail(Integer code, String message) {
        return new Result<>(code, message);
    }

    public static <T> Result<T> error() {
        return error(ResultCode.ERROR);
    }

    public static <T> Result<T> errorWithNull() {
        return error(ResultCode.PARAM_ERROR_EMPTY);
    }

    public static <T> Result<T> errorWithNull(String message) {
        return error(ResultCode.PARAM_ERROR_EMPTY.getCode(),
                "param [" + message + "] is required!");
    }

    public static <T> Result<T> error(ResultCode code) {
        return error(code.getCode(), code.getMessage());
    }

    public static <T> Result<T> error(Integer code, String message) {
        return new Result<>(code, message);
    }

}