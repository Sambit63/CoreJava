package com.SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialzation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D:\\JSpiders_Java\\FileHandleFolder\\A.txt");
		ObjectInputStream of=new ObjectInputStream(f);
		Student s=(Student)of.readObject();
		System.out.println(s);
		System.out.println("DeSerialization Done");
		of.close();
	}

}
