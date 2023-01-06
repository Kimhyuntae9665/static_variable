package chapter002.entity;

public class People {
	public String name;
	int age;
	String gender;
	String address;
	String email;
	
	People(String name,String gender){//생성자 People 
		this.name = name;
		this.gender = gender;
		System.out.println("작동 기모링");
	}
	
	public People() {
		System.out.println("작동하나?");
	}
	
	
	public void eatBreakfast() {
		System.out.println("7시에 아침을 먹습니다");
	}

}
