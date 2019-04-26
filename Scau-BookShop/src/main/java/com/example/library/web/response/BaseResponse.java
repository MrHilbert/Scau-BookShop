package com.example.library.web.response;

import com.example.library.web.result.ResultCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 回复信息
 * @author Hilbert
 * @Date 2019.04.23
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> {
	public String resultCode;
	public String msg;
	public T data;

	public BaseResponse(String resultCode) {
		this.resultCode = resultCode;
	}

	public BaseResponse(String resultCode, String detail) {
		this.resultCode = resultCode;
		this.msg = detail;
	}

	public BaseResponse(String resultCode, T data) {
		this.resultCode = resultCode;
		this.data = data;
	}

	public static <T> BaseResponse<T> success(T data) {
		return new BaseResponse<T>(ResultCode.SUCCESS, data);
	}

	public static <T> BaseResponse<T> success(String detail) {
		return new BaseResponse<T>(ResultCode.SUCCESS, detail);
	}

	public static <T> BaseResponse<T> fail(String detail) {
		return new BaseResponse<T>(ResultCode.ERROR, detail);
	}
}
