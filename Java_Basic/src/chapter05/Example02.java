package chapter05;

abstract class  SuperClass{
	abstract void superMethod();
}

class SubClass extends SuperClass{
	@Override
	void superMethod() {
		System.out.println("�ڼ� �޼��� �Դϴ�");
	}
}

public class Example02 {
	
//	������ 
	enum EXAMPLE_ENUM{FIRST,SECOND,THIRD};
	
	final int FIRST = 0;
	final int SECOND= 1;
	final int THIRD = 2;
	
	

	public static void main(String[] args) {
		System.out.println(EXAMPLE_ENUM.SECOND.ordinal());

	}

}
