package 총_집합_고객정보;

import java.util.ArrayList;
import java.util.List;

//회원 등록
//회원 정보 보기
//회원 정보 수정 
//회원 삭제 
//회원 리스트 
public class Main {  //Create Read Update Delete 백엔드 기본 요소 
	
//	List 는 interface 이므로 그대로 객체 생성 불가 참조변수로만 사용 ==> ArrayList로 객체 생성 
	
	private List<User> database = new ArrayList<User>(); //Generics 끼리는 쌍 맞춰줘야 한다 
	
	
	//회원 등록
//	id는 0이상의 수 이어야 하고 password, name, telNUmber는 빈값이 아니면서 null도 아니어야 한다. 
	private boolean createUser(int id,String password,String name,String telNumber) {
		if(id<0) return false;
		if(password.isEmpty() || name.isEmpty() || telNumber.isEmpty()) return false;
		if(password == null||name==null||telNumber==null) return false;//null과 isEmpty()는 다르다
		
//		아이디 중복 체크 
		if(checkOverlap(id)) {
			System.out.println("아이디가 중복 되었습니다");
			return false;
		}
//		관리하고자하는 객체를 생성 
		User user = new User(id,password,name,telNumber);
//		생성한 객체를 데이터베이스에 삽입 
//		Collection framework은 add로 원소 집어 넣는다 
		database.add(user);
		//삽입 결과를 반환 
		return true;
	}
	//회원 정보 보기
	private User readUser(int id) { //저장된 정보 읽어 오기 id가 primary key이니까 id 사용 
//		파라미터가 정상적인 값인지 검증 
		if(id<0) return null;
//		database 에서 헤당 id를 검색 
		User user = selectUser(id);
//		검색 결과를 반환 
		return user;
	}
	//회원 정보 수정
	private User updateUser() {
		reuturn null;
	}
	//회원 삭제
	private boolean deleteUser(){
		reuturn false;
	}
	//회원 리스트 
	private List<User> getUserList(){ //반환 값으로 User 를 담고 있는 List를 반환한다 
		reuturn null;
	}
	//메인 메서드 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
//	회원 아이디가 중복되는지 검사하는 메서드 
	private boolean checkOverlap(int id) {
		for(User user:database) {
			if(user.getId()==id) return true;
		}
		return false;
	}
	
//	특정 회원 아이디를 database에서 검색하는 메서드(Searching 작업 )
	private User selectUser(int id) { //Searching은 primary key로 검색한다 
		for(User user:database) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null; //data가 존재하지 않는다는 뜻으로 null을 반환해준다.
	}

}
