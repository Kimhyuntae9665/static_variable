package ExceptionHandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example05 {

	public static void main(String[] args) {
//		Set 클래스
		
		Set<String> set1 =  new HashSet<String>();//set 은 interface 라서 객체 생성 불가 ==> HashSet 으로 객체 생성
		
		
//		set 구조에 데이터를 추가 
		set1.add("apple");
		set1.add("banana");
		set1.add("chocolate");
		set1.add("diamond");
		set1.add("elephent");
//		set은 순서가 없기 때문에 인덱스로 접근 불가능 
//		==> Iterator 로 접근 
//		Iterator로 set 컬렉션에 접근 
		Iterator<String> hashSetIterator = set1.iterator();
		
		
//		Iterator의 hasNext() 메서드로 다음 요소가 있으면 반복
		while(hashSetIterator.hasNext()) {
//			Iterator의 next() 메서드로 다음 요소를 가져옴 
			System.out.println(hashSetIterator.next());
		}
		
		System.out.println("============================");
		
		
		Set<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("carrot");
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("banana");
		
		Iterator<String> treeSeIterator = treeSet.iterator();
		
		while(treeSeIterator.hasNext()) {
			System.out.println(treeSeIterator.next()); //정렬이 되서 나온다
		}
		
		
		System.out.println("===============================");
		
		System.out.println(treeSet.size());
		
		
//		List Interface 
//		배열 쓰지 않고 List Interface를 자주 쓸 것이다 
		List<Integer> numbers = new ArrayList<Integer>(); //Generic 자리에는 기본 data type은 넣을 수 없다 
		numbers.add(2);
		numbers.add(9);
		numbers.add(-1);
		numbers.add(50);
		
//		특정한 위치에 특정 데이터를 넣을 수 있다 
		numbers.add(2,100);//2번 index에 100을 넣는다 
		numbers.set(3, 1); //추가 가 아니라 교체 set 
		numbers.remove(2); //특정한 위치에 있는 데이터를 제거 할때
		
		for(Integer number: numbers) {//List 는 순서가 있기 떄문에 굳이 Iterator 까지 쓸 필요가 없다 
			System.out.println(number);
		
		}
		
		
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		
//		arrayList 작업시간 
//		메모리 공간 많이 차지 하지 않지만 작업시간이 많이 길다 
		long start  = System.currentTimeMillis();
		
		for(int i=0;i<200;i++) {
			arrayList.add(0,String.valueOf(i));
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("ArrayList 작업 시작 : "+(end - start ));
		
		
		
//		LinkedList 작업시간 
//		메모리 공간 많이 차지하지만 작업시간 아주 작아 
		start  = System.currentTimeMillis();
		
		for(int i=0;i<200;i++) {
			linkedList.add(0,String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("LinkedList 작업 시작 : "+(end - start ));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
