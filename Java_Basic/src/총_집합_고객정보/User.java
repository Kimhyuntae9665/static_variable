package 총_집합_고객정보;

public class User {
//	아이디
//	구분자 , Primary Key(id를 기준으로 하나만으로도 모든 인스턴스 데이터 구분 가능 )
	private int id;
//	비밀번호
	private String password;
//	이름
	private String name;
//	전화번호
	private String teleNumber;
	
//	생성자 
	public User(int id,String password,String name,String telNumber) {
		this.id  = id;
		this.password  = password;
		this.name  = name;
		this.teleNumber  = telNumber;

	}
	
//	getter, setter 메서드 만들어서 다른 class에서도 private get ,set 가능 하도록 
	
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
