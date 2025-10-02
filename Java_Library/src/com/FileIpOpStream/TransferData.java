package com.FileIpOpStream;
import java.io.*;
public class TransferData {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\JSpiders_Java\\JavaProgrammings\\Arrays\\src\\com\\Sortings\\BubbleSort.java");
		FileOutputStream f1=new FileOutputStream("D:\\JSpiders_Java\\FileHandleFolder\\A.txt");
		FileInputStream f=new FileInputStream(file);
		if(file.canRead())
		{
			int n=f.read();
			while(n!=-1)
			{
				f1.write((char)n);
				n=f.read();
			}
		}
		else
			System.out.println("Can not read");
		f.close();
		f1.close();
	}

}
