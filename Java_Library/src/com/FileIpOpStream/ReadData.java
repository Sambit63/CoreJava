package com.FileIpOpStream;
import java.io.*;
public class ReadData {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\JSpiders_Java\\JavaProgrammings\\Arrays\\src\\com\\Sortings\\BubbleSort.java");
		FileInputStream f=new FileInputStream(file);
		if(file.canRead())
		{
			int n=f.read();
			while(n!=-1)
			{
				System.out.print((char)n);
				n=f.read();
			}
		}
		else System.out.println("Can not read");
		f.close();
	}

}
