package com.iu.io.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherMenu {
	private Scanner sc;
	private WeatherService ws;
	WeatherView wv=null;

	public void start() {
		//1.날씨정보초기화
		//2.날씨정보출력
		//3.날씨검색출력
		//4.날씨정보추가
		//5.날씨정보삭제
		//6.종료
		boolean check = true;
		ArrayList<Weather> ar = new ArrayList<Weather>();
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
				ws = new WeatherService();
				ws.init();
				break;
			case 2:
				wv= new WeatherView();
				wv.view(ar);
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
			case 6:
				check = false;
				break;

			default :
				System.out.println("잘못입력하셨습니다");
				System.out.println("1~6 사이의 번호를 입력하세요");
				break;
			}
		}
	
	}

}
