package com.FileHandling;
import java.io.*;
import java.io.File;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\JSpiders_Java\\FileHandleFolder\\A.txt");
		FileOutputStream f=new FileOutputStream(file);
		String s="Sambit";
		byte[] b=s.getBytes();
		if(file.canWrite())
		{
			f.write(b);
		}
		else
			System.out.println("Can not Write...");
		f.close();
	}

}
