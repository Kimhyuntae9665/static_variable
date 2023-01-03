package Chapter02;
import SmartPhone.*;


class Triangle{
	double base,height,diagonal;
	
	
	void createandPrint() {
		base=3;
		height = 4;
		diagonal = 5;
		
		System.out.println("=============================");
		System.out.println("base : "+base);
		System.out.println("heigth : "+height);
		System.out.println("diagonal : "+diagonal);
		System.out.println("=============================");
	}
	
}


class Pythagoras{
//	static ���� 
	static String creator = "Pythagoras";
//	�غ� 
//	instance ���� 
//	instance �� �����ɶ�  ���� �����ȴ� 
	double base;
//	����
	double heigth;
//	�밢�� 
	double diagonal;
//	 �밢���� ���̸� ���ϴ� ���� 
//	static �Լ��� instance ������ �������(instance ���� ���� ����) instance ���� �������� �����ϴ� �Լ� 
	static double getDiagonal(double base,double heigth) {
		return Math.sqrt(Math.pow(base,2)+Math.pow(heigth, 2));
	}
//	�غ��� ���̸� ���ϴ� ����
	double getBase() {
		return Math.sqrt(Math.pow(diagonal,2)+Math.pow(heigth, 2));
	}
//	������ ���̸� ���ϴ� ���� 
	double getHeight() {
		return Math.sqrt(Math.pow(diagonal,2)+Math.pow(base, 2));
	}
}

public class Example02 {

	public static void main(String[] args) {
		
		
		
		SmartPhone[] phones =new SmartPhone[3];
		
		for(int i=0;i<phones.length;i++) {
			System.out.println(phones[i]);
			phones[i] = new SmartPhone();
		}
		System.out.println("==================");
		System.out.println(phones);
		System.out.println("==================");
		
		for(SmartPhone phone:phones) {
			System.out.println(phone);
			phone.mynation = "United State";
			phone.myos = "iOS";
			phone.myowner = "John";
			phone.mytelNumber = "010-1111-1111";
			
		}
		
		System.out.println("====================");
		
		for(SmartPhone phone:phones) {
			System.out.println(phone.mynation);
			System.out.println(phone.myos);
			System.out.println(phone.myowner);
			System.out.println(phone.mytelNumber);
			System.out.println("=====================");
		}
		
		int a = 10;
		int b = 20;
		int c = 30;
//		Math.pow(): ������ �ŵ����� 
//		�밢���� ����
		double r1 = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
//		�غ��� ���� 
		double r2 = Math.sqrt(Math.pow(c,2)+Math.pow(b, 2));
//		������ ���� 
		double r3 = Math.sqrt(Math.pow(c,2)+Math.pow(a, 2));
		
		Pythagoras p1 = new Pythagoras();
		p1.base = 10;
		p1.heigth = 20;
		p1.diagonal = 30;
		
		double diagonal = p1.getDiagonal(3,5);
		System.out.println(p1.creator);
		p1.creator = "NewTon"; // instance ���� �޸� ������ �ٸ��� ���Ƿ� p1�� p2�� �������� ��� ��� 
		System.out.println(p1.creator);
		
		Pythagoras p2 = new Pythagoras();
		System.out.println(p2.creator);
//		static ���� ������ ������ ���������� ������ instance�� �����ϱ� ������ p1.creator�� �ٲٸ� p2.creator ������ �ٲ��
		
		System.out.println(Pythagoras.creator);
//		static ������ instance ���̵� class ��ü���� ���� ��������
		
		System.out.println(Pythagoras.getDiagonal(3, 4));
		
//		�ﰢ�� instance �����
		Triangle triangle = new Triangle();
		
		triangle.base = 3;
		triangle.height = 4;
		triangle.diagonal = 5;
		
		System.out.println("base : " + triangle.base);
		System.out.println("height : "+triangle.height);
		System.out.println("diagonal : "+triangle.diagonal);
		
		Triangle triangle2 = new Triangle();
		Triangle triangle3 = new Triangle();
		Triangle triangle4 = new Triangle();
		Triangle triangle5 = new Triangle();
		
		triangle2.createandPrint();
		triangle3.createandPrint();
		triangle4.createandPrint();
		triangle5.createandPrint();
		

	}

}
