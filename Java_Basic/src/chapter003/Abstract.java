package chapter003;

// �߻� Ŭ���� : 
// Ŭ������ �߻������θ� ǥ���� �� Ŭ���� 


// abstract �����ڸ� ���� 
abstract class Animal2{
	String eyes;
	String ears;
	String legs;
	
	
//	�ش� �޼��忡 ���ؼ� ���� �ص� �޼��� 
	abstract void eat(); //abstract method�� body�� �ʿ�� ���� �ʴ´� 
	
	
	
}


class Dog extends Animal2{
	String tail;
	
	void eat() {
		System.out.println("���ٱ��� �Խ��ϴ� ");
	}
	
}



public class Abstract {

	public static void main(String[] args) {
		
		Animal2 animal = new Animal2(); //�߻� Ŭ���� �δ� ��ü ���� �Ұ� 
		Animal2 dog = new Dog();
		dog.eat();
		

	}

}
