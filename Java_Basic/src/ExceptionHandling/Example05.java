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
//		Set Ŭ����
		
		Set<String> set1 =  new HashSet<String>();//set �� interface �� ��ü ���� �Ұ� ==> HashSet ���� ��ü ����
		
		
//		set ������ �����͸� �߰� 
		set1.add("apple");
		set1.add("banana");
		set1.add("chocolate");
		set1.add("diamond");
		set1.add("elephent");
//		set�� ������ ���� ������ �ε����� ���� �Ұ��� 
//		==> Iterator �� ���� 
//		Iterator�� set �÷��ǿ� ���� 
		Iterator<String> hashSetIterator = set1.iterator();
		
		
//		Iterator�� hasNext() �޼���� ���� ��Ұ� ������ �ݺ�
		while(hashSetIterator.hasNext()) {
//			Iterator�� next() �޼���� ���� ��Ҹ� ������ 
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
			System.out.println(treeSeIterator.next()); //������ �Ǽ� ���´�
		}
		
		
		System.out.println("===============================");
		
		System.out.println(treeSet.size());
		
		
//		List Interface 
//		�迭 ���� �ʰ� List Interface�� ���� �� ���̴� 
		List<Integer> numbers = new ArrayList<Integer>(); //Generic �ڸ����� �⺻ data type�� ���� �� ���� 
		numbers.add(2);
		numbers.add(9);
		numbers.add(-1);
		numbers.add(50);
		
//		Ư���� ��ġ�� Ư�� �����͸� ���� �� �ִ� 
		numbers.add(2,100);//2�� index�� 100�� �ִ´� 
		numbers.set(3, 1); //�߰� �� �ƴ϶� ��ü set 
		numbers.remove(2); //Ư���� ��ġ�� �ִ� �����͸� ���� �Ҷ�
		
		for(Integer number: numbers) {//List �� ������ �ֱ� ������ ���� Iterator ���� �� �ʿ䰡 ���� 
			System.out.println(number);
		
		}
		
		
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		
//		arrayList �۾��ð� 
//		�޸� ���� ���� ���� ���� ������ �۾��ð��� ���� ��� 
		long start  = System.currentTimeMillis();
		
		for(int i=0;i<200;i++) {
			arrayList.add(0,String.valueOf(i));
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("ArrayList �۾� ���� : "+(end - start ));
		
		
		
//		LinkedList �۾��ð� 
//		�޸� ���� ���� ���������� �۾��ð� ���� �۾� 
		start  = System.currentTimeMillis();
		
		for(int i=0;i<200;i++) {
			linkedList.add(0,String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("LinkedList �۾� ���� : "+(end - start ));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
