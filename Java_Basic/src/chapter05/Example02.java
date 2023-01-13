package chapter05;

abstract class  SuperClass{
	abstract void superMethod();
}

class SubClass extends SuperClass{
	@Override
	void superMethod() {
		System.out.println("자손 메서드 입니다");
	}
}

public class Example02 {
	
//	열거형 
	enum EXAMPLE_ENUM{FIRST,SECOND,THIRD};
	
	final int FIRST = 0;
	final int SECOND= 1;
	final int THIRD = 2;
	
	

	public static void main(String[] args) {
		System.out.println(EXAMPLE_ENUM.SECOND.ordinal());

	}

}
