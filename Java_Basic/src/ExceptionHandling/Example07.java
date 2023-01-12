package ExceptionHandling;

class Ticketing{
	static int ticketVolume = 1;
	
	
//	synchronized Ű����� �ش� �޼��带 ���� �޼���� ���� 
//	�� �����尡 �ش� �޼��带 �۾� ���� �� ������ ���� 
	public static synchronized void  ticketing() {
		if(ticketVolume>0) { //ticketing �����ϰ� 
			System.out.println(Thread.currentThread().getName()+" - Ƽ����!");
			ticketVolume--;
		}else {
			System.out.println(Thread.currentThread().getName()+" - Ƽ���� ����!");
		}
		System.out.println(Thread.currentThread().getName()+" - Ƽ���� �õ� �� ���� Ƽ�� �� : "+ticketVolume);
	}
}

class TicketingThread implements Runnable {
	
	Ticketing ticketing = new Ticketing();
	
	@Override
	public void run() {
		ticketing.ticketing();
	}
}


public class Example07 {

	public static void main(String[] args) {
		
		TicketingThread runnable = new TicketingThread();
		
		Thread thread1 = new Thread(runnable,"A");
		Thread thread2 = new Thread(runnable,"B");
		Thread thread3 = new Thread(runnable,"C");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
