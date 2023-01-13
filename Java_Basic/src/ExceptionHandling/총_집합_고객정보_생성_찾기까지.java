package ExceptionHandling;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class 총_집합_고객정보_생성_찾기까지 {

	public static void main(String[] args) {
		Random random = new Random();
		
		//		로또 번호를 저장할 배열
		int[] lottoList1 = new int[6];
		
		for(int i=0; i<lottoList1.length; i++) {
			boolean flag = false;
			
			int lotto = random.nextInt(45)+1; //1~45까지 
			
			for(int j=0;j<lottoList1.length;j++) {
				
				
				if(lottoList1[j] == lotto) { //중복되는 애가 나온면 
					flag = true;
					break;
				}
			}
			if(flag) { //중복이 발생해서 다시 로또번호 생성으로 간다 
				i--; //한 번 더 로또 번호 생성해야 해서 
				continue;
			}
				
				lottoList1[i] = lotto;
			}
		
			Arrays.sort(lottoList1); //오름 차순 정렬 
			
		
			for(int lotto2:lottoList1) {
				System.out.println(lotto2);
			}
			
			System.out.println("==============================");
			
			Set<Integer> lottoList2 = new TreeSet<Integer>(); //Treeset 특성으로 중복제거 + 크기 순서대로 나온다 
			while(lottoList2.size()<6) {
				lottoList2.add(random.nextInt(45)+1);
			}
			
			for(Integer i:lottoList2) {
				System.out.println(i);
			}
			
			
			
		}

	}


