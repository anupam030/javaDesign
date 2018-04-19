package com.java.design.creational.singleton;

import java.io.Serializable;

//Double Checked Locking based Java implementation of
//singleton design pattern
//There are mainly 3 concepts which can break singleton property of a class
//Reflection,Serialization,Cloning
public class Singleton implements Serializable,Cloneable{
	
	private volatile static Singleton obj;

    /*public static Singleton uniqueInstance = new Singleton(); // we can also do this but then it won,t be a lazy initialization
	Classloader will create the instance when the class will be loaded.*/
	
	private Singleton(){
		
	}
	
	
	// we can make whole getInstance() as synchronized but due to this we will have to bear the cost of the synchronization 
	//to avoid this we only need to lock the code which is responsible for the creation of object.
	//But it is still broken untill we make instance variable volatile.
	
	/*Without volatile modifier it's possible for another thread in Java to see half initialized state of _instance variable, but with
	volatile variable guaranteeing happens-before relationship, all the write will happen on volatile _instance before any read of 
	_instance variable.

	This was not the case prior to Java 5, and that's why double checked locking was broken before. Now, with happens-before
	guarantee, you can safely assume that this will work.*/
	
	public static Singleton getInstace(){
		
		if(obj==null) {
			
			synchronized(Singleton.class) {
				
				if (obj==null) {
					obj=new Singleton();
				}
				
			}
			
		}
		
		return obj;
		
	}
	// return getInstance in readResolve to prevent another instance of Singleton through the process of Serialization
    private Object readResolve(){
        return getInstace();
    }

 // return getInstance in clone() method  to prevent another instance from returning different instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return getInstace();
    }
}
