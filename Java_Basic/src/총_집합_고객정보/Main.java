package ��_����_������;

import java.util.ArrayList;
import java.util.List;

//ȸ�� ���
//ȸ�� ���� ����
//ȸ�� ���� ���� 
//ȸ�� ���� 
//ȸ�� ����Ʈ 
public class Main {  //Create Read Update Delete �鿣�� �⺻ ��� 
	
//	List �� interface �̹Ƿ� �״�� ��ü ���� �Ұ� ���������θ� ��� ==> ArrayList�� ��ü ���� 
	
	private List<User> database = new ArrayList<User>(); //Generics ������ �� ������� �Ѵ� 
	
	
	//ȸ�� ���
//	id�� 0�̻��� �� �̾�� �ϰ� password, name, telNUmber�� ���� �ƴϸ鼭 null�� �ƴϾ�� �Ѵ�. 
	private boolean createUser(int id,String password,String name,String telNumber) {
		if(id<0) return false;
		if(password.isEmpty() || name.isEmpty() || telNumber.isEmpty()) return false;
		if(password == null||name==null||telNumber==null) return false;//null�� isEmpty()�� �ٸ���
		
//		���̵� �ߺ� üũ 
		if(checkOverlap(id)) {
			System.out.println("���̵� �ߺ� �Ǿ����ϴ�");
			return false;
		}
//		�����ϰ����ϴ� ��ü�� ���� 
		User user = new User(id,password,name,telNumber);
//		������ ��ü�� �����ͺ��̽��� ���� 
//		Collection framework�� add�� ���� ���� �ִ´� 
		database.add(user);
		//���� ����� ��ȯ 
		return true;
	}
	//ȸ�� ���� ����
	private User readUser(int id) { //����� ���� �о� ���� id�� primary key�̴ϱ� id ��� 
//		�Ķ���Ͱ� �������� ������ ���� 
		if(id<0) return null;
//		database ���� ��� id�� �˻� 
		User user = selectUser(id);
//		�˻� ����� ��ȯ 
		return user;
	}
	//ȸ�� ���� ����
	private User updateUser() {
		reuturn null;
	}
	//ȸ�� ����
	private boolean deleteUser(){
		reuturn false;
	}
	//ȸ�� ����Ʈ 
	private List<User> getUserList(){ //��ȯ ������ User �� ��� �ִ� List�� ��ȯ�Ѵ� 
		reuturn null;
	}
	//���� �޼��� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
//	ȸ�� ���̵� �ߺ��Ǵ��� �˻��ϴ� �޼��� 
	private boolean checkOverlap(int id) {
		for(User user:database) {
			if(user.getId()==id) return true;
		}
		return false;
	}
	
//	Ư�� ȸ�� ���̵� database���� �˻��ϴ� �޼���(Searching �۾� )
	private User selectUser(int id) { //Searching�� primary key�� �˻��Ѵ� 
		for(User user:database) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null; //data�� �������� �ʴ´ٴ� ������ null�� ��ȯ���ش�.
	}

}
