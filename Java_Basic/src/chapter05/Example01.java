package chapter05;

import java.util.ArrayList;
import java.util.List;

import chapter002.entity.Developer;

class MyInfo<JI,TMP>{ //Generic �ڸ��� �⺻ Ÿ���� �Ұ� int,double�� �� �Ұ� 
	String name;
	String job;
//	������ ���� 
	JI jobInfo;  //���߿� Generic ���ϸ� �ڵ����� �ٲ�� �� ž������ 
	TMP tmp;
	
	 <T,TM> void getTmpList(List<T> list,TM tmp){
		
	}
}

public class Example01 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
//		���ʸ� 
//		�پ��� Ÿ���� �ٷ�� Ŭ���� Ȥ�� �޼��忡�� Ÿ���� ������ �ִ� �� 
//		Collection framework �̱� ������ 
//		.add�� ���Ҹ� ä�� �־��ش� 
		List strList = new ArrayList();
		strList.add("�⺻ ���ڿ�");
//		���ʸ��� ������� ������ �Ź� �۾��� ���� ����ȯ �۾��� �����ؾ� �� 
		
		String str = (String) strList.get(0);
		
		List<String> strList2 = new ArrayList<String>();
//		���ʸ��� ����ϸ� �̹� �ٷ�����ϴ� �������� Ÿ���� �˰� �ֱ� ������ 
//		����ȯ �۾��� �ʿ� ���� 
		strList2.add("�⺻ ���ڿ�");
		String str2 = strList2.get(0);
		
		MyInfo info1 = new MyInfo();
		info1.jobInfo = new Developer();
		
		Developer developer = (Developer)info1.jobInfo;
		
		MyInfo<Developer,Integer> info2 = new MyInfo<Developer,Integer>();
//		class MyInfo<Developer>�� �ٲ�� �� ������ ���� JI�� Developer�� �ٲ�� 
		info2.jobInfo = new Developer();
		Developer developer2 = info2.jobInfo;		
		
//		���ʸ� �ȿ� �ֵ��� ������������ ���ƾ� �Ѵ� 
//		���ʸ� Ŭ������ Ÿ�� ������ �������� ������� �ʱ� ������ ����� ����� Ÿ�Ժ����� ������ ����ϴ� Ÿ�Ժ����� ���ƾ� �Ѵ�.
		MyInfo<Object,Object> info3 = new MyInfo<Developer,Integer>();
		
		
//		? Ű���带 ����Ͽ� Ÿ�Ժ����� �������� �����ų �� �ִ�.
		MyInfo<?,?> info4 = new MyInfo<Developer,Integer>();
		info4.getTmpList(new ArrayList<Developer>(), new Integer(10));
		
	}

}
