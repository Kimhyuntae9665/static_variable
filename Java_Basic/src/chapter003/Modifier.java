package chapter003;




//  public : Ŭ����,�޼��� �ַ� ��� 
//  private : �ɹ� ���� �ַ� ���  �ɹ� ������ ������ ��Ƶ���  

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
	
	
//	private ���� ����� �ɹ������� �ʱ�ȭ�ϱ� ���� 
//	ù��° �����  �����ڸ� �̿� 
//	�����ڸ� �̿��� ����� �ν��Ͻ��� ������ ���� �ɹ� ������ �ʱ�ȭ 
	
	
	
	
//	�� ��° ��� : Setter �޼��带 �̿� 
//	 �޼��� �̸��� set���� �����Ѵ� 
	public void setName(String name) {
		this.name = name;
	}
	
//	private instance �������� �Լ��� ���� ���� ��� �Ѵ�.
//	�ܺο��� �ɹ������� �����ϱ� ���� ���
//	Getter �޼��带 �̿� 
//	�޼��� �̸��� Get���� �����Ѵ�
	public String getName() {
		return this.name;
	}
	
	
	
	
	public void print_name() {
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.telNumber);
	}
	
	

}
