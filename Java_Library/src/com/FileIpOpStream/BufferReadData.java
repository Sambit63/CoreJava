package com.FileIpOpStream;
import java.io.*;
public class BufferReadData {
	public static void main(String[] args) throws IOException {
		int count=0;
		FileReader f=new FileReader("D:\\\\JSpiders_Java\\\\JavaProgrammings\\\\Arrays\\\\src\\\\com\\\\Sortings\\\\BubbleSort.java");
		BufferedReader bf=new BufferedReader(f);
		String s=bf.readLine();
		while(s!=null)
		{
			System.out.println(s);
			count++;
			s=bf.readLine();
		}
		bf.close();
		System.out.println(count);
	}
}
