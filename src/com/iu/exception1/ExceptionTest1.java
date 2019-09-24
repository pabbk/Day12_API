package com.iu.exception1;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력");
		int age =0;
		try {
			age = sc.nextInt();
			
			age =5/age;
			if(age !=0){
				age = 5/age;
			}
		}catch(Exception e) {
			//예외처리시 실행할 코드
			System.out.println("예외 발생");
			//e.printStackTrace();
		System.out.println("Age : "+age);

	}

}
}