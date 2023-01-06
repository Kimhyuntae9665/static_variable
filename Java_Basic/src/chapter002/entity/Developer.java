package chapter002.entity;

public class Developer extends People{
	public String LanguageSkill;
	public String company;
	public String developPosition;
	
	
	
	public Developer(String name,String gender,String company){
//		super() : 슈퍼(상위) 클래스의 생성자 		
		super(name,gender);
		this.company = company;
	}
	
	@Override
	public void eatBreakfast() { //상속받은 함수를 자신에게 맡게 변경하는 것 
		System.out.println(this.name+"은 10시에 아침 밥을 먹습니다 ");
	}
	
	public Developer() {
		super();   // 기본 생성자는 자신이 상속 받는 super class 의 기본 생성자를 자동으로 호출 한다 
	}

}
