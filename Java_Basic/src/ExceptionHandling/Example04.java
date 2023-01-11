package ExceptionHandling;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

class Batch1 extends TimerTask{

	@Override
	public void run() {
		System.out.println("Batch1 ���� ");
	}
	
}

class Batch2 extends TimerTask{

	@Override
	public void run() {
		System.out.println("Batc2 ���� ");
	}
	
}

public class Example04 {

	public static void main(String[] args) {
//		�ý��� �ð� 
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		
//		Calendar class
//		��¥ ���õ� java.util.package 
		Calendar calendar1 = Calendar.getInstance(); //getInstance()�� static �Լ� 
		Calendar calendar2 = new GregorianCalendar();
		
		System.out.println(calendar1.toString());
		System.out.println(calendar2.toString());
		
//		����
		System.out.println(calendar1.get(Calendar.YEAR));
//		��(Calendar Ŭ������ 1�� == 0)
		System.out.println(calendar1.get(Calendar.MONTH));
//		��
		System.out.println(calendar1.get(Calendar.DATE));
//		���� (�Ͽ��� : 1,������ : 2...)
		System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
		
		calendar2.set(2022,12,25);
		System.out.println(calendar2);
		
//		�и��� ������ �ð�,��,�� �� ǥ�� 
		int millToHours = 32400000/(60*60*1000); //1�� �� 1000�и� ���� 1�� �� 60�� 1�ð� �� 60�� 
		System.out.println(millToHours); //9�ð� 
		
//		java.util package�� Date Ŭ���� 
		Date date = new Date();
		
//		java.util package �� SimpleDateFormat Ŭ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd. MM. yyyy. HH:mm");
		
		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));
		
//		Date Ŭ������ Calendar Ŭ������ ������ ������ 
//		java.time package�� Ŭ���� 
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString());
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime.toString());
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toString());
		
		LocalDateTime localDateTimeOf = LocalDateTime.of(2022, 12,25,8,20);
		System.out.println(localDateTimeOf.toString());
		
		System.out.println(localDateTime.getMonth());
		
		localDateTime.minusYears(10).plusMonths(5);
		
		
		
		
//		�� �� �Ŀ� �����ϵ��� �ϴ� Timer ���� ���� 
		Batch1 batch1 = new Batch1();
		Batch2 batch2 = new Batch2();
		
		Timer timer = new Timer(true);
		
//		timer.schedule(batch1, 5000); //���� �� 5�� �Ŀ� ���� 
//		timer.schedule(batch2, 3000);//���� �� 3�� �Ŀ� ���� 
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
//		Decimal Text Format 
		DecimalFormat decimalFormat = new DecimalFormat("##,###.##");
		System.out.println(decimalFormat.format(50000.988));
		
	}

}
