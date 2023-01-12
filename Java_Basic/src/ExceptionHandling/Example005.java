package ExceptionHandling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example005 {

	public static void main(String[] args) {
//		Map의 Generic은 2개
//		Generic 자리에는 기본 type 올 수 없다 (int,double,float) 등 불가 
//		다형성 느낌 
		Map<String, String> hashMap = new HashMap<String,String>();
		
//		HashMap 에 데이터를 추가할 땐 put!
		hashMap.put("key place ", "Value place");
		hashMap.put("name", "John doe");
		hashMap.put("address", "United State");
		
		
//		hash map 에서 특정한 키에 해당하는 값을 가져온다
		System.out.println(hashMap.get("name")); //key가 name 인 아이의 value를 가져온다 
		
		Set<String> keys = hashMap.keySet();//key set들 값들만 나온다 
		Iterator<String> keyIterator = keys.iterator();//key 값들만 나온다 
		
		while(keyIterator.hasNext()) {
			System.out.println(keyIterator.next()); //key 값들만 나온다 
		}
		
		
		if(hashMap.containsKey("age")) { //key의 존재 유무부터 확인하고 가져온다 
			System.out.println(hashMap.get("age"));
		}
		
		
		

	}

}
