package SmartPhone;

public class SmartPhone {
	public String mynation;
	public String myos;           //�������� public �� �ٿ����� �ٸ� java ���Ͽ��� import�ؼ� ����� �����ϴ�
	public String myowner;
	public String mytelNumber;
	
	
	public String yournation;
	public String youros;
	public String yourowner;
	public String yourtelNumber;
	
	
	
	
//	�޼���
	void mytel(String toTelNumber) {
//		��ȭ��ȣ�� ���̸� '��ȭ��ȣ�� �Է��ϼ���'
		if(toTelNumber.isEmpty()) { //�� �� Ȯ�� �Ҷ��� isEmpty() �Լ� ��� 
			System.out.println("��ȭ ��ȣ�� �Է��ϼ���");
		}
//		���� �ƴϸ� 'ToTelNumber'�� ��ȭ���Դϴ�.
		System.out.println(toTelNumber+ "�� ��ȭ���Դϴ�");
		
	}

	void mysend_Message(String toTelNumber,String message_content) {
		System.out.println(toTelNumber+"��"+message_content+"�� �����ϴ�.");
	}

	public static void main(String[] args) {
		

	}

}
