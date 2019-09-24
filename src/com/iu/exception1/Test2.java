package com.iu.exception1;

public class Test2 {

	public void cal(int n1, int n2) throws Exception{
		
		int num3 = n1 + n2;
		//exception 강제발생
		if(num3>99) {
			throw new MyException();
		}
		System.out.println(num3);
		
		
	}
	
	
}
