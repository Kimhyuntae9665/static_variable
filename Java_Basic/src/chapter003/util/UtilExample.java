package chapter003.util;

public class UtilExample {
	
	public static final int NUMBER = 10;
	
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int pow(int a,int b) {
		
		for(int i=0;i<b;i++) {
			a*=a;
			
		}
		return a;
		
	}

}
