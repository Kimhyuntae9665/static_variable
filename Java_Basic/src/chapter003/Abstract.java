package chapter003;

// 추상 클래스 : 
// 클래스를 추상적으로만 표현해 둔 클래스 


// abstract 제어자를 포함 
abstract class Animal2{
	String eyes;
	String ears;
	String legs;
	
	
//	해당 메서드에 대해서 선언만 해둔 메서드 
	abstract void eat(); //abstract method는 body를 필요로 하지 않는다 
	
	
	
}


class Dog extends Animal2{
	String tail;
	
	void eat() {
		System.out.println("뼈다구를 먹습니다 ");
	}
	
}



public class Abstract {

	public static void main(String[] args) {
		
		Animal2 animal = new Animal2(); //추상 클래스 로는 객체 생성 불가 
		Animal2 dog = new Dog();
		dog.eat();
		

	}

}
