package ExceptionHandling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example005 {

	public static void main(String[] args) {
//		Map�� Generic�� 2��
//		Generic �ڸ����� �⺻ type �� �� ���� (int,double,float) �� �Ұ� 
//		������ ���� 
		Map<String, String> hashMap = new HashMap<String,String>();
		
//		HashMap �� �����͸� �߰��� �� put!
		hashMap.put("key place ", "Value place");
		hashMap.put("name", "John doe");
		hashMap.put("address", "United State");
		
		
//		hash map ���� Ư���� Ű�� �ش��ϴ� ���� �����´�
		System.out.println(hashMap.get("name")); //key�� name �� ������ value�� �����´� 
		
		Set<String> keys = hashMap.keySet();//key set�� ���鸸 ���´� 
		Iterator<String> keyIterator = keys.iterator();//key ���鸸 ���´� 
		
		while(keyIterator.hasNext()) {
			System.out.println(keyIterator.next()); //key ���鸸 ���´� 
		}
		
		
		if(hashMap.containsKey("age")) { //key�� ���� �������� Ȯ���ϰ� �����´� 
			System.out.println(hashMap.get("age"));
		}
		
		
		

	}

}
