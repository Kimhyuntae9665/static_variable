package chapter003;

import chapter003.util.UtilExample; //java ������ ������ ���� 
// static ���� Ȥ�� �޼��� import 
import static chapter003.util.UtilExample.NUMBER;

public class Example01 {

	public static void main(String[] args) {
		UtilExample util = new UtilExample(); //UtilExample class�� ���� 
		
		System.out.println(util.pow(3, 2));
		System.out.println(NUMBER);
		System.out.println(Math.PI);
		System.out.println(Math.E);

	}

}
