package com.iu.io.ex1;

import java.util.Scanner;

public class WeatherMenu {
	Scanner sc;
	

	public void start() {
		//1.날씨정보초기화
		//2.날씨정보출력
		//3.날씨검색출력
		//4.날씨정보추가
		//5.날씨정보삭제
		//6.종료
		boolean check = true;
		while(check) {
			System.out.println("1.날씨정보초기화");
			System.out.println("2.날씨정보출력");
			System.out.println("3.날씨검색출력");
			System.out.println("4.날씨정보추가");
			System.out.println("5.날씨정보삭제");
			System.out.println("6.종료");
			sc = new Scanner(System.in);
			int choose = sc.nextInt();

			switch(choose)
			{
			case 1:
				WeatherService ws = new WeatherService();
				ws.init();
				break;
			case 2:
				System.out.println("날씨정보출력");
				break;
			case 3:
				System.out.println("날씨검색출력");
				break;
			case 4:
				System.out.println("날씨정보추가");
				break;
			case 5:
				System.out.println("날씨정보삭제");
				break;

			default :
				check = false;
				break;
			}
		}
	}


}
