package ��_����_������;

public class User {
//	���̵�
//	������ , Primary Key(id�� �������� �ϳ������ε� ��� �ν��Ͻ� ������ ���� ���� )
	private int id;
//	��й�ȣ
	private String password;
//	�̸�
	private String name;
//	��ȭ��ȣ
	private String teleNumber;
	
//	������ 
	public User(int id,String password,String name,String telNumber) {
		this.id  = id;
		this.password  = password;
		this.name  = name;
		this.teleNumber  = telNumber;

	}
	
//	getter, setter �޼��� ���� �ٸ� class������ private get ,set ���� �ϵ��� 
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeleNumber() {
		return this.teleNumber;
	}
	public void setTeleNumber(String teleNumber) {
		this.teleNumber = teleNumber;
	}
	
	

	

}
