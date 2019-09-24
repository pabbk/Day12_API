package com.iu.io;

import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		
		File file = new File("c:\\test\\sub1");
		
		//String [] ar = file.list();
		File[] ar=file.listFiles();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
			//File f = new File("c:\\test\\sub1\\"+ar[i]);
			//f.delete();
			ar[i].delete();
		}
	}
}
