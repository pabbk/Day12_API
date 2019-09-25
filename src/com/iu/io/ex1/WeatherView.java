package com.iu.io.ex1;

import java.util.ArrayList;

public class WeatherView {

	/*public static void main(String[] args) {
		int [] a = {10,30,60,55};
		
		for(int[] a : a) {
			
		}
	}
	*/
	public void view (ArrayList<Weather> ar) {
		//향상된 for문
		//for(저장된Datatype 변수명 : 컬렉션변수명){}
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i).getCity());
			System.out.println(ar.get(i).getGion());
			System.out.println(ar.get(i).getHumi());
			System.out.println(ar.get(i).getStatus());
		}
	}
}
