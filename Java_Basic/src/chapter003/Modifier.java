package chapter003;




//  public : 클래스,메서드 주로 사용 
//  private : 맴버 변수 주로 사용  맴버 변수의 변경이 어렵도록  

public class Modifier {
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Modifier(String name, String address, String telNumber) {
		super();
		this.name = name;
		this.address = address;
		this.telNumber = telNumber;
	}


	public String getTelNumber() {
		return telNumber;
	}


	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}




	private String name;
	private String address;
	private String telNumber;
	
	
//	private 으로 선언된 맴버변수를 초기화하기 위한 
//	첫번째 방법은  생성자를 이용 
//	생성자를 이용한 방법은 인스턴스를 생성할 때만 맴버 변수를 초기화 
	
	
	
	
//	두 번째 방법 : Setter 메서드를 이용 
//	 메서드 이름을 set으로 시작한다 
	public void setName(String name) {
		this.name = name;
	}
	
//	private instance 변수들은 함수로 접근 변경 출력 한다.
//	외부에서 맴버변수에 접근하기 위한 방법
//	Getter 메서드를 이용 
//	메서드 이름을 Get으로 시작한다
	public String getName() {
		return this.name;
	}
	
	
	
	
	public void print_name() {
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.telNumber);
	}
	
	

}
