package ExceptionHandling;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ��_����_������_����_ã����� {

	public static void main(String[] args) {
		Random random = new Random();
		
		//		�ζ� ��ȣ�� ������ �迭
		int[] lottoList1 = new int[6];
		
		for(int i=0; i<lottoList1.length; i++) {
			boolean flag = false;
			
			int lotto = random.nextInt(45)+1; //1~45���� 
			
			for(int j=0;j<lottoList1.length;j++) {
				
				
				if(lottoList1[j] == lotto) { //�ߺ��Ǵ� �ְ� ���¸� 
					flag = true;
					break;
				}
			}
			if(flag) { //�ߺ��� �߻��ؼ� �ٽ� �ζǹ�ȣ �������� ���� 
				i--; //�� �� �� �ζ� ��ȣ �����ؾ� �ؼ� 
				continue;
			}
				
				lottoList1[i] = lotto;
			}
		
			Arrays.sort(lottoList1); //���� ���� ���� 
			
		
			for(int lotto2:lottoList1) {
				System.out.println(lotto2);
			}
			
			System.out.println("==============================");
			
			Set<Integer> lottoList2 = new TreeSet<Integer>(); //Treeset Ư������ �ߺ����� + ũ�� ������� ���´� 
			while(lottoList2.size()<6) {
				lottoList2.add(random.nextInt(45)+1);
			}
			
			for(Integer i:lottoList2) {
				System.out.println(i);
			}
			
			
			
		}

	}


