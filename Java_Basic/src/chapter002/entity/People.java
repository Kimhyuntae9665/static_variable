package chapter002.entity;

public class People {
	public String name;
	int age;
	String gender;
	String address;
	String email;
	
	People(String name,String gender){//������ People 
		this.name = name;
		this.gender = gender;
		System.out.println("�۵� ���");
	}
	
	public People() {
		System.out.println("�۵��ϳ�?");
	}
	
	
	public void eatBreakfast() {
		System.out.println("7�ÿ� ��ħ�� �Խ��ϴ�");
	}

}
