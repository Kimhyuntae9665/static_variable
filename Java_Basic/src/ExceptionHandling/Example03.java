package ExceptionHandling;

import java.util.Random;

public class Example03 {

	public static void main(String[] args) {
		
//		Wrapper Ŭ���� 
//		�⺻ ������ Ÿ���� Ŭ������ �̿��ؼ� ��ü�� �ٷ� 
//		int -> Integer 
		Integer integer = 100;
//		�⺻ Ÿ���� ��� ��ü�� ���ڿ��� ���� �Ұ��� 
//		int number = 100;
//		String numberStr = number;
		
		
//		Wrapper Class�� ���� ���� 
//		1. 
//		Wrapper Class �� �ۼ��� ���´� ���忭�� ���� ���� 
		String numberStr = integer.toString();
		System.out.println(numberStr);
		
		
//		�⺻ Ÿ���� ��� null�� �ʱ�ȭ�� �Ұ��� �ϴ� 
//		int number = null; //�⺻�� type�� null�� �� ����
		Integer number = 64; //Wrapper class�� null�� ���� �� �ִ� , �ʱ�ȭ ���� 
		
//		0int i = number.intValue();
		System.out.println(number.getClass().getName());
		
		
//		Random Class
//		�������� int,long,boolean,float,double ���� �������� JAVA API Class
		Random random = new Random();
		
		int rdInt = random.nextInt();
		System.out.println(rdInt);
		
		int rdInt2 = random.nextInt(5);//0~4������ ���´� 
		System.out.println(rdInt2);
		
		
	}

}
