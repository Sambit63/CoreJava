package com.FileHandling;
import java.io.*;
public class WriteData_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\JSpiders_Java\\FileHandleFolder\\A.txt");
		FileWriter f=new FileWriter(file);
		if(file.canWrite())
		{
			f.write("Jspiders \n");
			f.write("Qspiders\n");
			f.write("Pyspiders\n");
			f.write("Prospiders\n");
		}
		else
			System.out.println("Can not write...");
		f.close();
	}

}
