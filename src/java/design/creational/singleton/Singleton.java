package java.design.pattern;

//Double Checked Locking based Java implementation of
//singleton design pattern
public class Singleton {
	
	private volatile static Singleton obj;
	
	private Singleton(){
		
	}
	
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
	
	

}
