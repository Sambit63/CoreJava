package com.SerializationDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s=new Student("Sambit", 23, 1);
		FileOutputStream f=new FileOutputStream("D:\\\\JSpiders_Java\\\\FileHandleFolder\\\\A.txt");
		try(ObjectOutputStream of=new ObjectOutputStream(f))
		{
			of.writeObject(s);
		}
		System.out.println("Serialization Done");
	}

}
