package com.gausscode.competitiveanalysis.core;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 响应结果类
 * @author lx
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDto<Object> {

	/**
	 * 响应码
	 */
	private Integer statusCode;

	/**
	 * 错误信息
	 */
	private String msg;

	/**
	 * 数据
	 */
	private Object data;
}
