package chapter003;



// 제어자 
// 
abstract class Example02 {
	
//	접근 제어자 사용하는 이유
//	 캡슐화 
//	 1. 외부로 부터 데이터를 보호하기 위한 용도 
//	 2. 외부에서 불필요한, 내부적으로 사용되는 부분을 감추기 위함 
//	 굳이 외부 사용자에게 내부 정보를 공개하지 않는다 
	
	
//	public 접근제어자 
//  프로젝트 어디서든 접근이 가능하도록 함 
	public int number1;
	
//	protected 접근제어자 
//	같은 패키지 내에 있거나 해당 클래스를 상속받은 sub 클래스에서만 접근이 가능
//	외부 패키지에 있어도 상속 받으면 사용 가능 
	protected int number2;

	
//  default(package) 접근 제어자
//	가장 일반적인 지금까지 써온 접근 제어자 
//	같은 패키지 내에서만 접근이 가능 
	int number3;
	
	
//  private 접근 제어자 	
//  같은 class 내에서만 접근이 가능
	
	private int number4;
	
	
//	static, final
//	 static 제어자 : 해당 맴버변수와 메서드를 클래스 단위로 관리하기 위한 용도 
//	 final 제어자는 : 초기화 이후 값을 변형시키지 않고자 할 때 사용 
	static final int NUMBER_5 = 10;
	
	
//  abstract 제어자 
//	메서드를 선언부만 작성하고 실제 구현부는 상속받는 클래스가 구현하고자 할 때 
//	클래스 , 메서드에서만 사용가능 instance 변수에서는 사용하지 않는다 
//	abstract 함수는 abstract 클래스 안에서만 사용가능하다 
	
//	만약 abstract 제어자가 붙은 method가 있다면 
//	반드시 class에 abstract 제어자가 존재 해야 함 
	abstract void abstractMethod();
	
//	제어자를 조합할때 주의할 사항 
//	 매서드에 static 과 abstract를 동시에 사용할 수 없음
//	클래스에 final 과 abstract 를 동시에 사용할 수 없다
//	abstract 메서드의 접근제어자는 private일 수 없다 
	
	public static void main(String[] args) {
		
		
//		Modifier 클래스의 경우 public으로 선언 되었기 때문에 
//		모든 위치에서 사용 가능 
		Modifier modifier = new Modifier("Hani","vietnam","tee9665");
		
//		The field Modifier.name is not visible
//		modifier 클래스의 맴버 변수들을 private로 선언 했기 때문에 
//		클래스 외부에서 접근이 불가능 
		
		modifier.setName("minji");
		System.out.println(modifier.getName());
		
		modifier.getAddress();

		modifier.print_name();

	}

}
