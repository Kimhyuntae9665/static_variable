package Chapter02;


import chapter002.entity.*;





public class Example06 {

	public static void main(String[] args) {
		Developer d1 = new Developer("John",null,null); //부모 참조변수가 자식 객체를 품는것이 가능하지만 
//		참조형 변수에 데이터가 미정인 상태에서는 null
		String str = null;
		BusDriver b1 = new BusDriver();
		
//		d1 = null; //참조변수 d1에 메모리 주소 대신에 null이 들어가서 da.languageskill 을 assign 불가 하다는  
		
		d1.LanguageSkill=  " java" ;//부모 참조변수로 자식 instance 변수 를 불러오는 것은 불가능 
		System.out.println(d1.name);
//		Developer d1 = new People(); //자식 참조변수가 부모 객체를 품는 거는 불가능 
		d1.eatBreakfast();
		b1.eatBreakfast(); //자식 instance 가 부모의 함수를 쓰는 것은 당연 

	}

}
