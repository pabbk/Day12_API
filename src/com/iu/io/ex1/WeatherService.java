package com.iu.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WeatherService {

	
	public void init() {
		//날씨 정보 초기화
		//weatherinfo.txt 읽어서
		//파싱, 객체를 모아서 리턴
		
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test","weatherinfo.txt");
		FileReader fr = null;
		BufferedReader br = null;
		StringBuffer sb;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			boolean check = true;
			while(check) {
				String str = br.readLine();
				sb = new StringBuffer();
				sb.append(str);
				
				//여기서 따로 담거나 아무튼 여기서 뭐 해야함
				if(str==null) {
					break;
				}
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
