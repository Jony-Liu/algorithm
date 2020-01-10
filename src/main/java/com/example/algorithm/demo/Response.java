package com.example.algorithm.demo;

import java.io.Serializable;

/**
 * 响应封装类
 *
 * @param <T>
 * @author jonyliu
 * @date 2019/12/31 10:52
 */
public class Response<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String SUCCESS_STATUS = "1";
	public static final String ERROR_STATUS = "0";
	public static final String ERROR_CODE = "1000";
	public static final String SUCCESS_MESSAGE = "操作成功！";
	public static final String ERROR_MESSAGE = "接口调用失败！";


	// 1：操作成功，0：操作失败
	private String status;
	private String errorCode;
	private String message;
	private transient Object responseBody;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}

	/**
	 * 返回成功响应
	 */
	public static <T> Response<T> ok() {
		Response<T> response = new Response<T>();
		response.status = SUCCESS_STATUS;
		response.message = SUCCESS_MESSAGE;
		return response;
	}

	/**
	 * 返回成功响应,携带数据
	 */
	public static <T> Response<T> ok(Object data) {
		Response<T> response = new Response<T>();
		response.status = SUCCESS_STATUS;
		response.message = SUCCESS_MESSAGE;
		response.responseBody = data;
		return response;
	}

	/**
	 * 返回成功响应,携带数据
	 */
	public static <T> Response<T> okData(Object data, String status, String message) {
		Response<T> response = new Response<T>();
		response.status = status;
		response.message = message;
		response.responseBody = data;
		return response;
	}

	/**
	 * 返回错误响应
	 */
	public static <T> Response<T> fail() {
		Response<T> response = new Response<T>();
		response.status = ERROR_STATUS;
		response.errorCode = ERROR_CODE;
		response.message = ERROR_MESSAGE;
		return response;
	}

	/**
	 * 返回错误响应
	 */
	public static <T> Response<T> fail(String code, String message) {
		Response<T> response = new Response<T>();
		response.status = ERROR_STATUS;
		response.errorCode = code;
		response.message = message;
		return response;
	}

	/**
	 * 返回错误响应
	 */
	public static <T> Response<T> failData(Object data) {
		Response<T> response = new Response<T>();
		response.status = ERROR_STATUS;
		response.errorCode = ERROR_CODE;
		response.message = ERROR_MESSAGE;
		response.responseBody = data;
		return response;
	}

	/**
	 * 返回错误响应
	 */
	public static <T> Response<T> failData(String errorCode, String message, Object data) {
		Response<T> response = new Response<T>();
		response.status = ERROR_STATUS;
		response.errorCode = errorCode;
		response.message = message;
		response.responseBody = data;
		return response;
	}

}
