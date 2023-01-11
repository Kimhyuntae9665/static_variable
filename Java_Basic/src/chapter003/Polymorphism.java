package chapter003;


class Animal{
	 String ears;
	 String eyes;
	 String legs;
	
}


class Bird extends Animal{
	 String wings;
}

class Monkey extends Animal{
	 String arms;
	 
	 public Monkey() { // 기본 생성자 
		 
	}
	 
	 public Monkey(String arms,String eyes,String ears,String legs){
		 super.ears = ears;
		 super.eyes = eyes;
		 super.legs = legs;
//		 this 는 자기 자신 
	 }
	
}

public class Polymorphism {
	public static void main(String[] args) {
		Animal bird = new Bird();
		bird.ears = "ear";
		bird.eyes = "eye";
		bird.legs = "leg";
		
		Bird bird2 = (Bird)bird; //필수 : 형변환을 적어준다 Animal -> Bird로 
		bird2.wings = "wing";
		
		
		Monkey monkey1 = new Monkey("arms","eyes","ear","leg");
		System.out.println(monkey1);
		System.out.println(monkey1.arms+monkey1.eyes+monkey1.ears+monkey1.legs);
		
		Animal animal1 = monkey1; //자식을 부모 참조 변수에 넣기 가능 
		System.out.println(animal1);
		System.out.println(animal1.eyes+animal1.ears+animal1.legs);
		
		System.out.println(animal1 instanceof Monkey);
		System.out.println(animal1 instanceof Animal);
		
		Monkey monkey2 = (Monkey) animal1;
		System.out.println(monkey2);
		System.out.println(monkey2.arms+monkey2.eyes+monkey2.ears);
		
		
	}
	

}
