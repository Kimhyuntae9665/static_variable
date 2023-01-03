package SmartPhone;

public class SmartPhone {
	public String mynation;
	public String myos;           //변수에도 public 을 붙여야지 다른 java 파일에서 import해서 사용이 가능하다
	public String myowner;
	public String mytelNumber;
	
	
	public String yournation;
	public String youros;
	public String yourowner;
	public String yourtelNumber;
	
	
	
	
//	메서드
	void mytel(String toTelNumber) {
//		전화번호가 빈값이면 '전화번호를 입력하세요'
		if(toTelNumber.isEmpty()) { //빈 값 확인 할때는 isEmpty() 함수 사용 
			System.out.println("전화 번호를 입력하세요");
		}
//		빈값이 아니면 'ToTelNumber'에 전화중입니다.
		System.out.println(toTelNumber+ "에 전화중입니다");
		
	}

	void mysend_Message(String toTelNumber,String message_content) {
		System.out.println(toTelNumber+"에"+message_content+"를 보냅니다.");
	}

	public static void main(String[] args) {
		

	}

}
