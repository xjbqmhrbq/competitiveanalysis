package com.gausscode.competitiveanalysis.tools;


import com.gausscode.competitiveanalysis.core.ResultDto;
import com.gausscode.competitiveanalysis.core.StatusCodeEnum;

/**
 * @author lx
 * 结果dto工具类
 */
public class ResultUtil {

    private ResultUtil() {}

    public static ResultDto success(){
        return new ResultDto(StatusCodeEnum.SUCC.getCode(), StatusCodeEnum.SUCC.getDesc(), null);
    }

    public static ResultDto success(String msg, Object data){
        return new ResultDto(StatusCodeEnum.SUCC.getCode(), msg, data);
    }

    public static ResultDto success(Object data){
        return new ResultDto(StatusCodeEnum.SUCC.getCode(), StatusCodeEnum.SUCC.getDesc(), data);
    }

    public static ResultDto error(){
        return new ResultDto(StatusCodeEnum.ERROR.getCode(), StatusCodeEnum.SUCC.getDesc(), null);
    }

    public static ResultDto error(String msg){
        return new ResultDto(StatusCodeEnum.ERROR.getCode(), msg, null);
    }

    public static ResultDto custome(Integer code, String msg, Object data){
        return new ResultDto(code, msg, data);
    }

    /**
     * 未登陆返回对象
     * @return
     */
    public static ResultDto unauthentication() {
        return new ResultDto(StatusCodeEnum.UNAUTHENTICATION.getCode(), StatusCodeEnum.UNAUTHENTICATION.getDesc(), null);
    }

    /**
     * 无权限返回对象
     * @return
     */
    public static ResultDto unauthorization() {
        return new ResultDto(StatusCodeEnum.UNAUTHORIZATION.getCode(), StatusCodeEnum.UNAUTHORIZATION.getDesc(), null);
    }


    public static ResultDto generateResultDtoByMsg(String msg) {
        if (msg == null) {
            return ResultUtil.success();
        } else {
            return ResultUtil.error(msg);
        }
    }

}
