package ExceptionHandling;

import java.util.Scanner;

public class Example01 {
	
	static void printArray(int index) throws Exception {
		int[] arr = {1,2,3};
		System.out.println(arr[index]);
		
	}

	public static void main(String[] args) {
// 		���� ó�� 
//		�������̳� �޸� ���� ������ �����ڰ� �ڵ������ ���븦 ���� �� ���� ������ �ƴ϶� 
//		�����ϰ� ó���� �� �ִ� ����
		
		
//		0���� ������ ��Ȳ , input �� ������ ���� ���� ��
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
//		����ó�� 
		try {
//			���ܰ� �߻��� �� �ִ� ����
			int result = 10/a;
			System.out.println(result);
			
		}catch (Exception e) { //e �� java���� �̸� ������ ���� ��ü 
//			try �������� ���ܰ� �߻����� �� �����ϴ� ���� 
			System.out.println("0���� ���� ���� �����ϴ�.");
			
		}
//		int result = 10/a;
//		System.out.println(result);
		
//		�迭 �ε��� ��ȸ�� ������ ��� �� 
		int[] arr = {1,2,3};
//		arr[a] = 10;
		
		try {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>arr[i+1]) {
					System.out.println("���� ���� Ů�ϴ�.");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//printStackTrace()�� ���ܹ߻� ����� ȣ�⽺��(Call Stack)�� �־��� �޼ҵ��� ������ ���� �޽����� ȭ�鿡 ����Ѵ�.
		}finally {
			System.out.println("���� ����");
		}
		
		try {
			printArray(a);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("�ε��� ���� ��");
		}
		
	}

}
