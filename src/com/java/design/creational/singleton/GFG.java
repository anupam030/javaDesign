package com.java.design.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class GFG 
{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException
	{
		Singleton obj1 = Singleton.getInstace();
		Singleton obj2 = null;
		try
		{
			Constructor[] constructors = 
					Singleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) 
			{
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				obj2 = (Singleton) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}

		System.out.println("obj1.hashCode():- "
				+ obj1.hashCode());
		System.out.println("obj2.hashCode():- "
				+ obj2.hashCode());

		ObjectOutput out
		= new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(obj1);
		out.close();

		// deserailize from file to object
		ObjectInput in 
		= new ObjectInputStream(new FileInputStream("file.text"));

		Singleton obj3 = (Singleton) in.readObject();
		in.close();

		System.out.println("instance1 hashCode:- "
				+ obj1.hashCode());
		System.out.println("instance2 hashCode:- "
				+ obj3.hashCode());
		
		Singleton instance1 = Singleton.getInstace();
	    Singleton instance2 = (Singleton) instance1.clone();
	    System.out.println("instance1 hashCode:- "
	                           + instance1.hashCode());
	    System.out.println("instance2 hashCode:- "
	                           + instance2.hashCode()); 
	}
}