package com.gausscode.competitiveanalysis.core;


public enum StatusCodeEnum {

    /**
     * 成功
     */
    SUCC(200,"成功"),
    /**
     * 无数据
     */
    NODATA(404,"无数据"),

    PARAM(502,"参数格式错误"),
    /**
     * 没有登陆
     */
    UNAUTHENTICATION(401,"没有权限"),
    /**
     * 没有权限
     */
    UNAUTHORIZATION(403,"UNAUTHORIZATION"),
    /**
     * 系统异常
     */
    SYSTEM_ERROR(502,"系统内部异常"),
    /**
     * 失败
     */
    ERROR(999,"错误");

    private Integer code;
    private String desc;

    StatusCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
