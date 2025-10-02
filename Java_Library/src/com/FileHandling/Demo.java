package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\JSpiders_Java\\FileHandleFolder\\A.txt");
//		System.out.println(f.mkdir());
//		System.out.println(f.createNewFile());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		
		File f1=new File("D:\\\\JSpiders_Java\\\\FileHandleFolder\\B.txt");
		System.out.println(f.renameTo(f1));
		System.out.println(f.getAbsolutePath());
		
	}
}
