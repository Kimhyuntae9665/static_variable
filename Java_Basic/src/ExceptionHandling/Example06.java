package ExceptionHandling;



//  Thread 클래스를 상속받아서 Thread 만드느 방법 
class Thread1 extends Thread{
	
//	run을 override해서 작업할 내용을 구현 
@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.print("*");
//			Thread.yield()는 자신의 시간을 
//			다음 순번의 Thread에 양보 
			Thread.yield();
//			for(int j=0;j<10000;j++) {
//				
//			}
		}
		
	}
	
}

//  Runnable 인터페이스를 구현해서 Thread를 만드는 방법 

class Thread2 implements Runnable{
	
//	Runnable 인터페이스의 추상메서드 run()을 구현 
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
//		Thread .sleep()는 지정한 시간동안 
//		해당 스래드를 Blocked 상태로 만듦 (동작하지 않는다 )
		for(int i=10;i>0;i--) {
			System.out.println(i +" 초 ...");
			try {
//				ms 단위 
				Thread.sleep(1000); //1초 동안 Thread를 sleep / Blocked 시킨다 
//				Blocked 상태 : 실행중이지만 CPU 스케쥴러에 선택은 박지 못하는 상태 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("땡");
	}
}
public class Example06 {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
//		상속받은 Thread 클래스의 start() 메서드로 해당 Thread를 실행 
		
//		Thread 클래스의 생성자의 인자로 담아서 
//		Thread 인스턴스를 생성한 후 사용가능 
		Thread2 thread2 = new Thread2();
		Thread t = new Thread(thread2); //만든 thread2를 다시 넣어줘서 객체생성을 해야 t.start()로 실행시킬 수 있다 
		
//		Thread 클래스의 setPriority 메서드로 우선순위를 지정 
//		우선순위를 정하지 않으면 기본 값으로 5
//		
		thread1.setPriority(1);
		t.setPriority(9);
		
		thread1.start();
		
		try {
			thread1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		t.start(); //한 process 내에서 동시에 3개의 Thread가 동시에 돌아가고 있다 그래서 출력결과 막 썩여서 나온다 
		
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
