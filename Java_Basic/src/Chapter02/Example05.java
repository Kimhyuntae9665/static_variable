package Chapter02;


//생성자 & 오버로딩 
//오버로딩 : 같은 이름의 메서드를 매개변수의  상태를 다르게 하여 여러 개를 생성 할 수 있도록 함 

class Juice{
	
	String name;
	String company;
	int kcal;
	int volume;
	
	
public Juice() {
		
	}
	
	public Juice(String name,String company,int kcal,int volume) {
		this();
		this.name = name;
		this.company = company;
		this.kcal = kcal;
		this.volume = volume;
	}
	
	
	
	void drink(int ml) {
		System.out.println("int drink!");
		volume -= ml;
	}
//이름 같고 매개변수가 다른 두 함수 
//	오버로딩
	void drink(float ml) {
		System.out.println("double drink!");
		volume-=ml;
	}
	
	void drink(int ml1,int ml2) {
		System.out.println("int int  drink!");
		volume-=(ml1+ml2);
	}
	
}

public class Example05 {

	public static void main(String[] args) {
		Juice juice = new Juice();
		juice.name ="보성홍차";
		juice.company = "동원";
		juice.kcal = 0;
		juice.volume = 500;
		
		juice.drink(100);
		juice.drink(50.5F);  //float 형태는 뒤에 F 붙여야 한다.
		juice.drink(10,20);
		
		Juice juice2 = new Juice("옥 수수  수염차","롯데",0,800);
		System.out.println(juice2.name);
		System.out.println(juice2.company);
		System.out.println(juice2.kcal);
		System.out.println(juice2.volume);
		
		
		

	}

}
