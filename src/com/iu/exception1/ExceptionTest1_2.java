package com.iu.exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

public class ExceptionTest1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력");
		int age =0;
		try {
			age = sc.nextInt();
			//throw new InputMismatchException();
			age =5/age;
			//throw new InputMismatchException();
		}catch(InputMismatchException i) {
			System.out.println("숫자만 입력하세요");
		}catch(ArithmeticException a) {
			System.out.println("0으로 나눌 수 없습니다");
		}



		System.out.println("Age : "+age);

	}

}


