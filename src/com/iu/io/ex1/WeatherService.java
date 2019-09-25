package com.iu.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {


	public ArrayList<Weather> init() {
		ArrayList<Weather> ar = new ArrayList<Weather>();
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
			String str = null;

			while((str = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(str, ",");

				Weather weather = new Weather();
				String [] w = str.split(",");
				weather.setCity(w[0].trim());
				weather.setGion(Double.parseDouble(w[1].trim()));
				weather.setHumi(Integer.parseInt(w[2].trim()));
				weather.setStatus(w[3].trim());

				/*
					weather.setCity(st.nextToken().trim());
					weather.setGion(Double.parseDouble(st.nextToken().trim()));
					weather.setHumi(Integer.parseInt(st.nextToken().trim()));
					weather.setStatus(st.nextToken().trim());
				 */

				ar.add(weather);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return ar;
	}
	
	
}
