package ExceptionHandling;



//  Thread Ŭ������ ��ӹ޾Ƽ� Thread ����� ��� 
class Thread1 extends Thread{
	
//	run�� override�ؼ� �۾��� ������ ���� 
@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.print("*");
//			Thread.yield()�� �ڽ��� �ð��� 
//			���� ������ Thread�� �纸 
			Thread.yield();
//			for(int j=0;j<10000;j++) {
//				
//			}
		}
		
	}
	
}

//  Runnable �������̽��� �����ؼ� Thread�� ����� ��� 

class Thread2 implements Runnable{
	
//	Runnable �������̽��� �߻�޼��� run()�� ���� 
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.print("#");
//			for(int j=0;j<10000;j++) {
//				
//			}
		}
	}
}


class CountDown extends Thread{
	public void run() {
//		Thread .sleep()�� ������ �ð����� 
//		�ش� �����带 Blocked ���·� ���� (�������� �ʴ´� )
		for(int i=10;i>0;i--) {
			System.out.println(i +" �� ...");
			try {
//				ms ���� 
				Thread.sleep(1000); //1�� ���� Thread�� sleep / Blocked ��Ų�� 
//				Blocked ���� : ������������ CPU �����췯�� ������ ���� ���ϴ� ���� 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("��");
	}
}
public class Example06 {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
//		��ӹ��� Thread Ŭ������ start() �޼���� �ش� Thread�� ���� 
		
//		Thread Ŭ������ �������� ���ڷ� ��Ƽ� 
//		Thread �ν��Ͻ��� ������ �� ��밡�� 
		Thread2 thread2 = new Thread2();
		Thread t = new Thread(thread2); //���� thread2�� �ٽ� �־��༭ ��ü������ �ؾ� t.start()�� �����ų �� �ִ� 
		
//		Thread Ŭ������ setPriority �޼���� �켱������ ���� 
//		�켱������ ������ ������ �⺻ ������ 5
//		
		thread1.setPriority(1);
		t.setPriority(9);
		
		thread1.start();
		
		try {
			thread1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		t.start(); //�� process ������ ���ÿ� 3���� Thread�� ���ÿ� ���ư��� �ִ� �׷��� ��°�� �� �⿩�� ���´� 
		
		try {
			t.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		for(int i=0;i<20;i++) {
//			System.out.print("@");
//			for(int j=0;j<10000;j++) {
//				
//			}	
//		}
//		CountDown ct = new CountDown();
//		ct.start();
		
		
		
	}

}
