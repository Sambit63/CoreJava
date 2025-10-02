package com.FileIpOpStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterData {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("D:\\JSpiders_Java\\FileHandleFolder\\A.txt",true);
		try(BufferedWriter bf=new BufferedWriter(f))
		{
			bf.write("Rama");
			bf.newLine();
			bf.write("Sita");
		}
		
	}
}
