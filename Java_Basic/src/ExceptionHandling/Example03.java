package ExceptionHandling;

import java.util.Random;

public class Example03 {

	public static void main(String[] args) {
		
//		Wrapper 클래스 
//		기본 데이터 타입을 클래스를 이용해서 객체로 다룸 
//		int -> Integer 
		Integer integer = 100;
//		기본 타입일 경우 객체의 문자열로 변경 불가능 
//		int number = 100;
//		String numberStr = number;
		
		
//		Wrapper Class를 쓴느 이유 
//		1. 
//		Wrapper Class 로 작성된 형태는 문장열로 변경 가능 
		String numberStr = integer.toString();
		System.out.println(numberStr);
		
		
//		기본 타입일 경우 null로 초기화가 불가능 하다 
//		int number = null; //기본형 type은 null을 못 쓴다
		Integer number = 64; //Wrapper class는 null을 받을 수 있다 , 초기화 가능 
		
//		0int i = number.intValue();
		System.out.println(number.getClass().getName());
		
		
//		Random Class
//		무작위의 int,long,boolean,float,double 값을 가져오는 JAVA API Class
		Random random = new Random();
		
		int rdInt = random.nextInt();
		System.out.println(rdInt);
		
		int rdInt2 = random.nextInt(5);//0~4까지만 나온다 
		System.out.println(rdInt2);
		
		
	}

}
