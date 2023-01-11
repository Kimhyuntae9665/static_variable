package ExceptionHandling;

import java.util.Scanner;

public class Example01 {
	
	static void printArray(int index) throws Exception {
		int[] arr = {1,2,3};
		System.out.println(arr[index]);
		
	}

	public static void main(String[] args) {
// 		예외 처리 
//		컴파일이나 메모리 공간 부족등 개발자가 코드상으로 조취를 취할 수 없는 에러가 아니라 
//		예측하고 처리할 수 있는 문제
		
		
//		0으로 나누는 상황 , input 이 범위를 벗어 났을 때
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
//		예외처리 
		try {
//			예외가 발생할 수 있는 로직
			int result = 10/a;
			System.out.println(result);
			
		}catch (Exception e) { //e 는 java에서 미리 지정해 놓은 객체 
//			try 구문에서 예외가 발생했을 때 실행하는 로직 
			System.out.println("0으로 나눌 수는 없습니다.");
			
		}
//		int result = 10/a;
//		System.out.println(result);
		
//		배열 인덱스 조회시 범위를 벗어날 때 
		int[] arr = {1,2,3};
//		arr[a] = 10;
		
		try {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>arr[i+1]) {
					System.out.println("앞의 수가 큽니다.");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//printStackTrace()는 예외발생 당시의 호출스택(Call Stack)에 있었던 메소드의 정보와 예외 메시지를 화면에 출력한다.
		}finally {
			System.out.println("정상 종료");
		}
		
		try {
			printArray(a);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("인덱스 범위 밖");
		}
		
	}

}
