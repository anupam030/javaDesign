package com.java.design.structural.adapterpattern;


//Adapter pattern lets you convert a target interface to to adaptee interface by introducing adapter implmentation
// Target interface - Duck
//Adaptee interface - Turkey

//Adapter - Turey Adapter

//Turkey Adapter will compose the instance of Tukrey
//Client - DuckTestDrive
//1.Client makes a request to the adapter by calliing a method onitusing the target interface
//2.The Adapter transalates that request into oneor more calls onthe adaptee using the adapter interface
//3.The Client recives the result pfthe callandnever knows there is an adapter doing the translation
public class TurkeyAdapter implements Duck {
	
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey= turkey;	
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i= 0;i<5;i++){
			turkey.fly();
		}
		
	}

}
