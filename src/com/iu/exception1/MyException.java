package com.iu.exception1;

public class MyException extends Exception{

	@Override
	public String getMessage() {
		
		return "사용자 정의 exception 발생";
	}
}
