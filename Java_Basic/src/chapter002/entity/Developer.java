package chapter002.entity;

public class Developer extends People{
	public String LanguageSkill;
	public String company;
	public String developPosition;
	
	
	
	public Developer(String name,String gender,String company){
//		super() : ����(����) Ŭ������ ������ 		
		super(name,gender);
		this.company = company;
	}
	
	@Override
	public void eatBreakfast() { //��ӹ��� �Լ��� �ڽſ��� �ð� �����ϴ� �� 
		System.out.println(this.name+"�� 10�ÿ� ��ħ ���� �Խ��ϴ� ");
	}
	
	public Developer() {
		super();   // �⺻ �����ڴ� �ڽ��� ��� �޴� super class �� �⺻ �����ڸ� �ڵ����� ȣ�� �Ѵ� 
	}

}
